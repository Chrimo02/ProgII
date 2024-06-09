package Lektion20.KartenspielNeu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spieler {
    ArrayList<Karte> hand;
    public Spieler(){
        this.hand = new ArrayList<Karte>();
    }
    public void drawRandomHand(Kartendeck d, int anzahl){
        for (int i = 0; i<anzahl; i++){
            List<Karte> list = new ArrayList<>(d.kartendeck);
            int random = (int) (Math.random()*d.kartendeck.size());
            Karte karte = list.get(random);
            this.hand.add(karte);
            d.kartendeck.remove(karte);
        }
    }
    public void printHand(){
        for(Karte k : this.hand){
            k.printKarte();
        }
    }
}
