package Lektion19.ServerHangmanObject;

import java.io.Serializable;
import java.util.Scanner;

public class ClientGuess implements Serializable {
    char guess;
    public ClientGuess(){
        Scanner scanner = new Scanner(System.in);
        this.guess = scanner.nextLine().charAt(0);
    }
}
