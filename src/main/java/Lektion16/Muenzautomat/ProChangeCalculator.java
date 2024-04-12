package Lektion16.Muenzautomat;

public class ProChangeCalculator implements ChangeCalculator{
    @Override
    public int[] getChange(int euros, int cent) {
        //Coin[] wechselgeld1 = new Coin[] {Coin.CENT_1,Coin.CENT_2,Coin.CENT_5,Coin.CENT_10,Coin.CENT_20,Coin.CENT_50,Coin.EURO_1,Coin.EURO_2};
        int[] wechselgeld = new int[] {0,0,0,0,0,0,0,0};
        while (euros >= 2){
            wechselgeld[7]++;
            euros = euros - 2;
        }
        wechselgeld[6] = euros;
        while (cent >= 50){
            wechselgeld[5]++;
            cent = cent - 50;
        }
        while (cent >= 20){
            wechselgeld[4]++;
            cent = cent - 20;
        }
        while (cent >= 10){
            wechselgeld[3]++;
            cent = cent - 10;
        }
        while (cent >= 5){
            wechselgeld[2]++;
            cent = cent - 5;
        }
        while (cent >= 2){
            wechselgeld[1]++;
            cent = cent - 2;
        }
        wechselgeld[0] = cent;

        return wechselgeld;
    }
}
