package Lektion19.ServerHangmanObject;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        final int PORT = 50001;
        System.out.println("Server gestartet. Warte auf Verbindung...");
        try(ServerSocket ss = new ServerSocket(PORT)) {
            while (true){
                try (
                        Socket connection = ss.accept();
                        InputStream is = connection.getInputStream();
                        ObjectInputStream ois = new ObjectInputStream(is);
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clientMessage.dat")))
                {


                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void hangman(String loesung, ObjectOutputStream oos, ObjectInputStream ois) throws IOException
    {
        char[] richtigesWort = loesung.toCharArray();
        char[] loesungswort = new char[loesung.length()];
        // Initialisierung des char-Arrays mit Unterstrichen
        for (int i = 0; i < loesungswort.length; i++) {
            loesungswort[i] = '_';
        }

        int counter = 1;
        boolean stimmtUeberein = false;
        oos.write("Bitte geben Sie ihren ersten Buchstabentipp ein: ".getBytes());
        oos.flush();
        while (!stimmtUeberein && counter <= 15)
        {
            oos.write((counter + ". Versuch: " + String.valueOf(loesungswort) + "\n").getBytes());
            oos.flush();

            char versuch = ois.readChar();
            for (int k = 0; k < loesungswort.length; k++)
            {
                if (richtigesWort[k] == versuch || richtigesWort[k] == versuch-32 || richtigesWort[k] == versuch+32) {
                    loesungswort[k] = versuch;
                }

            }
            if (String.valueOf(loesungswort).equalsIgnoreCase(String.valueOf(richtigesWort))){
                oos.write(("Sie haben das Wort erraten: " + String.valueOf(loesungswort).toUpperCase() + "\n").getBytes());
                oos.flush();
                stimmtUeberein = true;
            }
            else{
                counter++;
                oos.write("Bitte geben Sie ihren nächsten Tipp ein: ".getBytes());
                oos.flush();
            }

        }
        if (counter == 16){
            oos.write("Sie haben keine Versuche mehr übrig\n".getBytes());
            oos.flush();
        }
    }
    public static String chooseGame(){
        String[] wortspeicher = new String[] {"COMPUTER","SONNENBLUME","ABENTEUER","SCHMETTERLING",
                "GITARRE","BIBLIOTHEK","ELEFANT","WASSERMELONE","BERGSTEIGEN","GEHEIMNIS","REGENBOGEN","ZIRKUS",
                "RUCKSACK","ZAUBEREI","ASTRONAUT","OZEAN","KAKTUS","PIZZA","QUOTIENT","EICHHOERNCHEN"};
        int random = (int) (Math.random()*wortspeicher.length);
        return wortspeicher[random];
    }
}
