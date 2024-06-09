package Lektion20.KartenspielNeu;

public enum Wertigkeit {SIEBEN(0),ACHT(1),NEUN(2),DAME(3),KOENIG(4),ZEHN(5),ASS(6),BUBE(7);

    final int rang;

    Wertigkeit(int rang){
        this.rang = rang;
    }

}
