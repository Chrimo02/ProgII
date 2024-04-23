package Lektion16.Muenzautomat;

public class Main {
    public static void main(String[] args) {
        ProChangeCalculator eisautomat = new ProChangeCalculator();
        
        int[] wechselgeld = eisautomat.getChange(4,36);
        
        for (int i = 0; i<wechselgeld.length;i++){
            System.out.print(wechselgeld[i] + " ");
        }
    }
}
