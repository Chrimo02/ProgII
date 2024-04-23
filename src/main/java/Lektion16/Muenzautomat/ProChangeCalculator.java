package Lektion16.Muenzautomat;

public class ProChangeCalculator implements ChangeCalculator{

    @Override
    public int[] getChange(int euros, int cent) {
        int[] wechselgeld = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        int[] coinValues = new int[] {Coin.EURO_2.value, Coin.EURO_1.value, Coin.CENT_50.value, Coin.CENT_20.value, Coin.CENT_10.value, Coin.CENT_5.value,Coin.CENT_2.value, Coin.CENT_1.value};
        int restBetrag = euros * 100 + cent;

        for (int i = 0; i < coinValues.length; i++) {
            wechselgeld[i] = restBetrag / coinValues[i]; //ermittelt Anzahl an Coin[i] die noch in den Restbetrag passen
            restBetrag %= coinValues[i]; //ermittelt mithilfe von modulo und der jeweiligen Coin-Wertigkeit den Restbetrag für den nächsten Durchlauf
        }
        return wechselgeld;
    }
}
