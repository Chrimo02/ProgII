package Lektion18.ServerHangman;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class TCPClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PORT = 50001;
        final String HOST = "localhost";

        try (Socket connectionToServer = new Socket(HOST,PORT);
             OutputStream os = connectionToServer.getOutputStream();
             InputStream is = connectionToServer.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is)))
        {
            String serverMessage;
            while (true){
                    String messageToServer = scanner.nextLine();
                    os.write((messageToServer + "\n").getBytes());
                    os.flush();
                    serverMessage = br.readLine();
                    System.out.println("Nachricht vom Server: " + serverMessage);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }


    }


}
