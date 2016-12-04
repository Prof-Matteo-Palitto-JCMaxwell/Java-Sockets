/*
 * socketWorker.java ha il compito di gestire la connessione al socket da parte di un Client.
 * Elabora il testo ricevuto che in questo caso viene semplicemente mandato indietro con l'aggiunta 
 * di una indicazione che e' il testo che viene dal Server.
 */
import java.net.*;
import java.io.*;

/**
 *
 * @author Prof. Matteo Palitto
 */
class SocketWorker implements Runnable {
  private Socket client;
  // VARIABILE PER CONTROLLARE IL PRIMO STREAM DI DATI
  private boolean firstAccess = true;
  private String nick = "";

    //Constructor: inizializza le variabili
    SocketWorker(Socket client) {
        this.client = client;
    }

    // Questa e' la funzione che viene lanciata quando il nuovo "Thread" viene generato
    public void run(){
        
        BufferedReader in = null;
        PrintWriter out = null;
        try{
          // connessione con il socket per ricevere (in) e mandare(out) il testo
          in = new BufferedReader(new InputStreamReader(client.getInputStream()));
          out = new PrintWriter(client.getOutputStream(), true);
        } catch (IOException e) {
          System.out.println("Errore: in|out fallito");
          System.exit(-1);
        }
        String line = "";
        if(firstAccess)
        {
            try{
                // LEGGO IL NICKNAME
                line = in.readLine();
                nick = line;
                firstAccess = false;
            } catch(IOException e) { System.out.println("Lettura da socket fallito");
                                     System.exit(-1); }
        }
        System.out.println("Connesso con: " + nick);
        while(line != null){
          try{
            line = in.readLine();
            //Manda lo stesso messaggio appena ricevuto con in aggiunta il "nome" del client
            out.println("Server-->" + nick + ">> " + line);
            //scrivi messaggio ricevuto su terminale
            System.out.println(nick + ">> " + line);
           } catch (IOException e) {
            System.out.println("lettura da socket fallito");
            System.exit(-1);
           }
        }
        try {
            client.close();
            System.out.println("connessione con client: " + nick + " terminata!");
        } catch (IOException e) {
            System.out.println("Errore connessione con client: " + nick);
        }
    }
    // METODO CHE RITORNA IL NICKNAME
    public String getNick()
    {
        return nick;
    }
  
}
