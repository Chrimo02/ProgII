package Z_FunAndTest;
import java.util.Scanner;
public class Primzahl {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        for (int i = 0; i<100; i++){
            if (isPrime(i)) System.out.print(i + " ");
        }
        scanner.close();
    }
    public static boolean isPrime(int zahl){
        if (zahl == 0 || zahl == 1) return false;
        for (int i = zahl-1; i>1; i--){
            if (zahl % i == 0) return false;
        }
        return true;
    }
}
