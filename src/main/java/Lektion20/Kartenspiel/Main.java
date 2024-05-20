package Lektion20.Kartenspiel;

public class Main {
    public static void main(String[] args) {
        Kartenset mauMau = new Kartenset();
        Spieler player1 = new Spieler("John",mauMau);

        player1.kartenhand.printKartenhand();

    }
}
