package Lektion16.Muenzautomat;

public class Main {
    public static void main(String[] args) {
        ProChangeCalculator eisautomat = new ProChangeCalculator();
        
        int[] wechselgeld = eisautomat.getChange(3,88);
        
        for (int i = 0; i<wechselgeld.length;i++){
            System.out.print(wechselgeld[i] + " ");
        }

        /*Coin test = Coin.CENT_1;
        int x = test.value;
        System.out.println("\n" + x);

         */
    }
}
