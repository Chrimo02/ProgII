package Lektion17.Streamverdopplung;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] test = "Hallo Welt".getBytes();
        System.out.println(test.length);
        try(FileOutputStream fos1 = new FileOutputStream("file1.txt");
            FileOutputStream fos2 = new FileOutputStream("file2.txt"))
        {
            OutputStreamDoubler osd = new OutputStreamDoubler(fos1,fos2);
            osd.write(test);
            osd.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
