package Lektion17.Streamverdopplung;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{0,0,0,0,0,1,1,1};
        try(FileOutputStream fos1 = new FileOutputStream("file1.txt");
            FileOutputStream fos2 = new FileOutputStream("file2.txt"))
        {
            OutputStreamDoubler osd = new OutputStreamDoubler(fos1,fos2);
            osd.write(bytes);
            osd.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
