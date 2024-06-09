package Lektion20.KartenspielNeu;


import java.util.HashSet;
import java.util.Set;

public class Kartendeck {

    Set<Karte> kartendeck;
    public Kartendeck(){
        this.kartendeck = new HashSet<>();
        for (int i = 0; i< Spielfarbe.values().length; i++){
            for (int j = 0; j < Wertigkeit.values().length; j++){
                Karte newCard = new Karte(Spielfarbe.values()[i],Wertigkeit.values()[j]);
                kartendeck.add(newCard);
            }
        }
    }
}

