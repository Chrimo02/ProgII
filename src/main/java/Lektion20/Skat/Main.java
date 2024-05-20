package Lektion20.Skat;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Kartenset skat = new Kartenset();
        Spieler player1 = new Spieler("Walter",skat);
        //Collection test = player1.kartenhand.SkatHand;
        Collections.sort(player1.kartenhand.SkatHand);
        player1.kartenhand.printKartenhand();

    }
}
