# Java-Sockets
Concetti e realizzazione di una semplice connessione Client/Server usando Sockets in Java
```
Obitettivo del progetto: inviare linee di testo da un programma (Client)  ad un altro (Server) anche eventualmente remoto.
```
## Istruzioni
Per replicare il progetto sul vostro computer personale. Gli allievi potranno quindi apportare modifiche ed eventualmente fonderle con il progetto principale, o in alcuni casi creare un progetto propio.

### Prerequisiti
Java SDK (Software Development Kit) - programma per la compilazione (javac) da codice in Java a ByteCode. L'installazione comprende anche Java JRE (Java Runtime Envirorment) che fornisce la Virtual Machine (VM) su cui far eseguire il ByteCode.
```
E suggerito anche l'utilizzo di netBeans IDE (Integrated Development Envirorment)
```

### Installing

A step by step series of examples that tell you have to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Uso
Dal terminale del Server:
```
java ServerTestoMultiThreaded <port>
```
Da un terminale Client:
```
java client-Testo <host> <port>
dove:
* host puo' essere espresso sia in forma numerica (es. 127.0.0.1) che in forma alfanumerica (es. www.nomeSito.com)
```
NOTA: posso collegarmi al server con quanti Clients desidero, sia su stesso computer che da terminali su computer diversi.

### Esempio usando stesso computer sia per eseguire Server che multipli Clients
Da finestra di comando esguire il Server:
```
cd Documents\NetBeansProjects\Java-Sockets\Server
java ServerTestoMultiThreaded 1234
```
Da nuova finestra di comando esguire il ```primo``` Client
```
cd Documents\NetBeansProjects\Java-Sockets\Server
java client-Testo localhost 1234
```
Da nuova finestra di comando esguire il ```secondo``` Client
```
cd Documents\NetBeansProjects\Java-Sockets\Server
java client-Testo localhost 1234
```
## Diventa un collaboratore
Questa e' la lista di nuove funzioni da aggiungere al progetto:
1. Di seguito alla nuova connessione di un Client con il Server, viene richiesto il "NickName" che viene poi di seguito usato per la visualizzazione del messaggio (invece della porta del Client come da progetto iniziale)
2. Possibilita' di mandare un comando (es. ListaUtenti) al Server che di conseguenza restituisca la lista di tutti i Clients connessi.
3. Group Chat 
3.1. Possibilita' di iniziare una o piu' "group chat" fornendo per ogni chat il "Soggetto della discussione"
3.2. Possibilita' di invitare uno o piu' utenti conessi a entrare nella "goup chat"
3.3. Possibilita' di uscire dalla "group chat"

Mentre le modifiche descritte dai primi due punti risulteranno in una fusione (merge), le modifiche descritti dai punti 3 dovranno far parte di un nuovo progetto che parte da quello originario (fork).
 
## Licenza
opensource nel modo piu' completo del termine :) senza alcuna restrizione!

## Ringraziamenti
a mia moglie che mi ha permesso di trovare il tempo per questo progetto guardando il bambino ;)
