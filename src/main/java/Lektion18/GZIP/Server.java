package Lektion18.GZIP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.GZIPInputStream;

public class Server {
    public static void main(String[] args) {
        final int PORT = 5555;
        System.out.println("Server gestartet. Warte auf Verbindung...");
        try (ServerSocket ss = new ServerSocket(PORT))
        {
            while (true){
                try (Socket connection = ss.accept();
                    InputStream is = connection.getInputStream();
                     GZIPInputStream gis = new GZIPInputStream(is))
                {
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(gis))) {
                        String clientMessage;
                        while ((clientMessage = br.readLine()) != null) {
                            System.out.println("Nachricht vom Client: " + clientMessage);
                        }
                    }
                    catch (IOException e){
                        e.printStackTrace();
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
}
