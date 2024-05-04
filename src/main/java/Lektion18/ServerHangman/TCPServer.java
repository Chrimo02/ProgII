package Lektion18.ServerHangman;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) {
        final int PORT = 50001;
        System.out.println("Server gestartet. Warte auf Verbindung...");
        try(ServerSocket ss = new ServerSocket(PORT)) {
            while (true){
                try (
                        Socket connection = ss.accept();
                        InputStream is = connection.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        OutputStream os = connection.getOutputStream())
                {
                       while (true){
                           String clientMessage = br.readLine();
                           System.out.println("Nachricht vom Client: " + clientMessage);
                           if (clientMessage.equals("Ich will Hangman spielen")) hangman(chooseGame(),os,br);
                           else {
                               os.write("OK\n".getBytes());
                               os.flush();
                           }

                       }
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

    public static void hangman(String loesung, OutputStream os, BufferedReader br) throws IOException
    {
        char[] richtigesWort = loesung.toCharArray();
        char[] loesungswort = new char[loesung.length()];
        // Initialisierung des char-Arrays mit Unterstrichen
        for (int i = 0; i < loesungswort.length; i++) {
            loesungswort[i] = '_';
        }

        int counter = 1;
        boolean stimmtUeberein = false;
        os.write("Bitte geben Sie ihren ersten Buchstabentipp ein: ".getBytes());
        os.flush();
        while (!stimmtUeberein && counter <= 15)
        {
            os.write((counter + ". Versuch: " + String.valueOf(loesungswort) + "\n").getBytes());
            os.flush();

            char versuch = br.readLine().charAt(0);
            for (int k = 0; k < loesungswort.length; k++)
            {
                if (richtigesWort[k] == versuch || richtigesWort[k] == versuch-32 || richtigesWort[k] == versuch+32) {
                    loesungswort[k] = versuch;
                }

            }
            if (String.valueOf(loesungswort).equalsIgnoreCase(String.valueOf(richtigesWort))){
                os.write(("Sie haben das Wort erraten: " + String.valueOf(loesungswort).toUpperCase() + "\n").getBytes());
                os.flush();
                stimmtUeberein = true;
            }
            else{
                counter++;
                os.write("Bitte geben Sie ihren nächsten Tipp ein: ".getBytes());
                os.flush();
            }

        }
        if (counter == 16){
            os.write("Sie haben keine Versuche mehr übrig\n".getBytes());
            os.flush();
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
