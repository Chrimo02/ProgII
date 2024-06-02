package Lektion22.ThreadTCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Client {
    private static final int PORT = 50002;
    private static final String HOST = "localhost";
    List<Integer> zahlenToCheck;

    public static void main(String[] args) {
        Client c1 = new Client(1,2,3,4,5,6,7);
        Client c2 = new Client(2546,637,2457,13241);
        c1.startClient();
        c2.startClient();
    }
    public Client(Integer... zahlen){
        this.zahlenToCheck = new ArrayList<>();
        this.zahlenToCheck.addAll(Arrays.asList(zahlen));  //Mit Arrays.asList() kann eine Liste mit den Inhalten des Arrays erstellt werden
    }

    public void startClient(){
        try (Socket connectionToServer = new Socket(HOST,PORT);
             ObjectOutputStream oos = new ObjectOutputStream(connectionToServer.getOutputStream()); //  !!! WICHTIG: immer zuerst Object-Output-Stream, sonst funktionert es nicht !!!
             ObjectInputStream ois = new ObjectInputStream(connectionToServer.getInputStream()))
        {
            oos.writeObject(this.zahlenToCheck);
            oos.flush();
            Map<Integer, Boolean> antwort = (Map<Integer, Boolean>) ois.readObject();
            for (Map.Entry<Integer, Boolean> entry : antwort.entrySet()){
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
