package Lektion20.KartenspielNeu;

import java.util.Collections;

public class Main {
    //Durch die benutzung anderer Werte/Farben in den ENUMs kann somit jedes beliebige Kartenspiel implementiert werden
    public static void main(String[] args) {
        Spieler tom = new Spieler();
        Kartendeck skat = new Kartendeck();
        tom.drawRandomHand(skat,10);
        Collections.sort(tom.hand);
        tom.printHand();
    }
}
