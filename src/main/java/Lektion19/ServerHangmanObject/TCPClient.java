package Lektion19.ServerHangmanObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TCPClient {
    private final static int PORT = 50005;
    private final static String HOST = "localhost";

    public static void main(String[] args){
        try (Socket connectionToServer = new Socket(HOST,PORT);
             ObjectOutputStream oos = new ObjectOutputStream(connectionToServer.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(connectionToServer.getInputStream()))
        {
            boolean finished = false;
            do {
                AntwortObjekt antwort = (AntwortObjekt) ois.readObject();
                System.out.println(antwort);
                finished = antwort.erraten;
                ClientGuess x = new ClientGuess();
                oos.writeObject(x);
                oos.flush();
            } while (!finished);

        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
