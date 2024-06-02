package Lektion22.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};
    public static void main(String[] args)
    {
        //Variante zu Aufgabe a) + b):
        //TreeSet<String> t = new TreeSet<>(new MyComparator());

        //Variante zu Aufgabe c) (anonyme Klasse)
        TreeSet<String> t = new TreeSet<String>(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if (s1.length()<s2.length()) return -1;
                else if (s1.length()>s2.length()) return 1;
                else return s1.compareTo(s2);
            }
        });

        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
    /*
    Nachteile der Verwendung einer anonymen-Klasse in diesem Beispiel:
        - Comparator kann nicht an anderer Stelle wiederverwendet werden, z.B. wenn es ein zweites TreeSet gäbe, müsste man den Comparator dort neu implementieren
        - Redundanz-Gefahr
        - Schlechtere Lesbarkeit und Wartbarkeit, insbesondere wenn die Implementierung komplexer wird
        - Schwierigere Dokumentation, weil anonyme Klassen keinen Namen haben
    Vorteile der Verwendung einer anonymen-Klasse in diesem Beispiel:
        - keine extra Klasse benötigt
        - Übersichtlicher, da die Implementierung direkt an der Stelle sichtbar ist, an der sie verwendet wird

     */
}
