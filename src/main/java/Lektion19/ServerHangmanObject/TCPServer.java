package Lektion19.ServerHangmanObject;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    private final static int PORT = 50005;

    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(PORT))
        {
            System.out.println("Server gestartet auf Port " + PORT);
            while (true){
                try(Socket connection = ss.accept()){
                    Hangman hangman = new Hangman();
                        try(ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());
                            ObjectInputStream ois = new ObjectInputStream(connection.getInputStream()))
                        {
                            while (!hangman.erraten){
                                hangman.play(oos,ois);
                        }
                    }
                }

            }
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
