package Lektion20.Kartenspiel;

import java.util.ArrayList;

public class Kartenset {
    ArrayList<Spielkarte> kartenset;

    public Kartenset(){
        this.kartenset = new ArrayList<>(32);
        for (int i = 0; i< Spielfarbe.values().length;i++){
            for (int j = 0; j <Wertigkeit.values().length;j++){
                Spielkarte neueKarte = new Spielkarte(Spielfarbe.values()[i],Wertigkeit.values()[j]);
                kartenset.add(neueKarte);
            }
        }
    }

    public Spielkarte drawRandomCard(){
        int random = (int) (Math.random()*this.kartenset.size());
        return kartenset.remove(random);
    }
}
