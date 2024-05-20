package Lektion20.Kartenspiel;

import java.util.ArrayList;

public class MauMauHand {
    ArrayList<Spielkarte> kartenhand;
    public MauMauHand(Kartenset kartenset){
        this.kartenhand = createRandomDeck(kartenset);
    }

    private static ArrayList<Spielkarte> createRandomDeck(Kartenset kartenset){
        ArrayList<Spielkarte> karten = new ArrayList<>(5);
        for (int i = 0; i<5;i++){
            karten.add(kartenset.drawRandomCard());
        }
        return karten;
    }
    public void printKartenhand(){
        for (Spielkarte spielkarte : kartenhand) {
            spielkarte.printKarte();
        }
    }
}
