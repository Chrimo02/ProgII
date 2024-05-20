package Lektion20.Skat;

public enum Spielfarbe {
    HERZ(0), KARO(1), PIK(2), KREUZ(3);

    final int rang;

    Spielfarbe(int rang) {
        this.rang = rang;
    }
}