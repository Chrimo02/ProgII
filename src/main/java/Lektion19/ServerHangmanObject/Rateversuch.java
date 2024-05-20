package Lektion19.ServerHangmanObject;

import java.io.Serializable;
import java.util.Scanner;

public class Rateversuch implements Serializable {
    char versuch;
    public Rateversuch(){
        Scanner scanner = new Scanner(System.in);
        this.versuch = scanner.nextLine().charAt(0);
    }
}
