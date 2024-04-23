package Lektion17.Zeitmessung;
import java.io.*;
import java.util.Scanner;

public class CopyMP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bitte geben Sie den Dateipfad der zu kopierenden mp3-Datei an:");
            String dateipfad = scanner.nextLine();
            long[] unbufferedTimes = new long[10];
            long[] bufferedTimes = new long[10];
            long[] byteArrayTimes = new long[10];
            for (int i = 0;i<10;i++){
                unbufferedTimes[i] = copyUnbuffered(dateipfad);
                bufferedTimes[i] = copyBuffered(dateipfad);
                byteArrayTimes[i] = copyWithByteArray(dateipfad);
            }
            double avgUnbuffered = avg(unbufferedTimes);
            double avgBuffered = avg(bufferedTimes);
            double avgByteArray = avg(byteArrayTimes);
            System.out.println("Durchschnittsdauer Unbuffered: " + avgUnbuffered/1000000 +" Millisekunden.");
            System.out.println("Durchschnittsdauer Buffered: " + avgBuffered/1000000 + " Millisekunden");
            System.out.println("Durchschnittsdauer ByteArray: " +  avgByteArray/1000000 + " Millisekunden");
            System.out.println();
            System.out.println("Der Unbuffered-Kopiervorgang dauert circa " + (int) (avgUnbuffered/avgBuffered) + " mal so lange wie der Buffered-Kopiervorgang");
            System.out.println("Der Unbuffered-Kopiervorgang dauert circa " + (int) (avgUnbuffered/avgByteArray) + " mal so lange wie der ByteArray-Kopiervorgang");

        }
        catch (IOException e){
            System.out.println("Die Datei konnte nicht kopiert werden. Bitte überprüfen Sie ob der eingegebene Dateipfad gültig ist!");
        }
    }


    public static double avg(long[] array){
        double summe = 0.0;
        for (int i = 0; i<array.length;i++){
            summe = summe + array[i];
        }
        return summe/array.length;
    }
    private static void copy(InputStream is, OutputStream os) throws IOException{
        int b;
        do {
            b = is.read();
            if (b != -1) os.write(b);
        }
        while (b != -1);
    }

    public static long copyUnbuffered(String path) throws IOException{
        long startTimeBuffered = System.nanoTime();
        try(InputStream fis = new FileInputStream(path);
            OutputStream fos = new FileOutputStream("/Users/christian/IdeaProjects/Maven/mp3s/unbuffered_copy.mp3"))
        {
            copy(fis,fos);
        }
        long  endTimeBuffered = System.nanoTime();
        return endTimeBuffered-startTimeBuffered;
    }

    public static long copyBuffered(String path) throws IOException{
        long startTimeBuffered = System.nanoTime();
        try(InputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);
            OutputStream fos = new FileOutputStream("/Users/christian/IdeaProjects/Maven/mp3s/buffered_copy.mp3");
            BufferedOutputStream bos = new BufferedOutputStream(fos))
        {
            copy(bis,bos);
        }
        long  endTimeBuffered = System.nanoTime();
        return endTimeBuffered-startTimeBuffered;
    }
    public static long copyWithByteArray(String path) throws IOException{
        long startTimeBuffered = System.nanoTime();
        try(InputStream fis = new FileInputStream(path);
            OutputStream fos = new FileOutputStream("/Users/christian/IdeaProjects/Maven/mp3s/byteArray_copy.mp3"))
        {
            byte[] array = new byte[1024];
            int b;
            while ((b = fis.read(array)) != -1){
                fos.write(array,0,b);
            }
        }
        long  endTimeBuffered = System.nanoTime();
        return endTimeBuffered-startTimeBuffered;
    }
}
