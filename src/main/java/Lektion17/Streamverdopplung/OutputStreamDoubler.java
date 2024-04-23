package Lektion17.Streamverdopplung;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler extends OutputStream {
    OutputStream os1;
    OutputStream os2;
    public OutputStreamDoubler(OutputStream os1, OutputStream os2){
        this.os1 = os1;
        this.os2 = os2;
    }
    @Override
    public void close() throws IOException{
        IOException exception = null;
        try {
            os1.close();
        }
        catch (IOException e){
            exception = e;
        }
        try {
            os2.close();
        }
        catch (IOException e){
            if (exception == null){
                exception = e;
            }
            else exception.addSuppressed(e);
        }
        if (exception != null) {
            throw exception;
        }
    }
    @Override
    public void write(int b) throws IOException {
        IOException exception1 = null;
        IOException exception2 = null;
        try {
            os1.write(b);
        }
        catch (IOException e){
            exception1 = e;
            exception1.printStackTrace();
        }
        try {
            os2.write(b);
        }
        catch (IOException e){
            exception2 = e;
            exception2.printStackTrace();
        }
        if (exception1 != null && exception2 != null) throw new IOException("Es konnte in keinen der beiden Streams geschrieben werden!");


    }
}
