package Lektion17.Exceptions;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int x = Integer.valueOf(s.nextLine()); //NumberFormatException
        int[] abc = new int[]{1,2,3,4,5};
        //int y = abc[5];                       //ArrayIndexOutOfBoundsException
        Auto audi = new Auto("Magenta");
        //String gibFarbe = audi.next.farbe;  //NullPointerException
        //outOfMemory(7); //outOfMemoryException
        //FileInputStream test = new FileInputStream("lol.jpg"); //FileNotFoundException
        int w = 5/0; //ArithmeticException;

    }

    public static int outOfMemory(int x){
        return outOfMemory(x);
    }
}
