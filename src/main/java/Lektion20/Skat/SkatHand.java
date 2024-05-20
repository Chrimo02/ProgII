package Lektion20.Skat;

import java.util.ArrayList;

public class SkatHand {
    ArrayList<Spielkarte> SkatHand;
    public SkatHand(Kartenset kartenset){
        this.SkatHand = createRandomDeck(kartenset);
    }

    private static ArrayList<Spielkarte> createRandomDeck(Kartenset kartenset){
        ArrayList<Spielkarte> karten = new ArrayList<>(10);
        for (int i = 0; i<10;i++){
            karten.add(kartenset.drawRandomCard());
        }
        return karten;
    }
    public void printKartenhand(){
        for (Spielkarte spielkarte : SkatHand) {
            spielkarte.printKarte();
        }
    }
}
