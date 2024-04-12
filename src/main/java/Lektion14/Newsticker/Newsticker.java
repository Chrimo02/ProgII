package Lektion14.Newsticker;

public class Newsticker {
    public static void main(String[] args) {
        String nachricht1 = "Wettervorhersage: Schnee in Wuerzburg";

        Ticker ticker1 = new Ticker(45);
        ticker1.setNachricht(nachricht1);
        ticker1.rotateNachricht(0);
        ticker1.printNachricht();
        ticker1.rotateNachricht(6);
        ticker1.printNachricht();

        //ticker1.resetNachricht('?');
        //ticker1.resetNachricht();

        //Wie funktioniert es, dass der Ticker nach links geschoben wird, anstatt wie bei mir nach rechts??
    }
}
