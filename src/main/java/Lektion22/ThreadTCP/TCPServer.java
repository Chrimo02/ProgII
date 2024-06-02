package Lektion22.ThreadTCP;

import Lektion22.PrimzahlThread.PrimzahlThread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Map;

public class TCPServer {
    private static final int PORT = 50002;
    public static void main(String[] args) {
        new TCPServer().startServer();
    }
    public void startServer(){
        try (ServerSocket ss = new ServerSocket(PORT)){
            System.out.println("Server gestartet auf Port " + PORT);
            while (true){
                Socket connection = ss.accept();
                System.out.println("Neuer Client verbunden: " + connection.getInetAddress().getHostAddress());
                Thread t = new Thread(new ClientThread(connection));
                t.start();
                //new Thread(new ClientThread(connection)).start();  ->kürzere Schreibweise
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    private static class ClientThread implements Runnable{
        Socket connection;
        public ClientThread(Socket socket){
            this.connection = socket;
        }
        @Override
        public void run(){
            try (OutputStream os = connection.getOutputStream();
                 ObjectOutputStream oos = new ObjectOutputStream(os);
                 InputStream is = connection.getInputStream();
                 ObjectInputStream ois = new ObjectInputStream(is))
            {
                List<Integer> listToCheck = (List<Integer>) ois.readObject();
                PrimzahlThread pT = new PrimzahlThread(listToCheck);
                pT.start();
                Map<Integer, Boolean> result = pT.getErgebnis();
                oos.writeObject(result);
                oos.flush();
            }
            catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
            finally {
                try {
                    connection.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }



}
