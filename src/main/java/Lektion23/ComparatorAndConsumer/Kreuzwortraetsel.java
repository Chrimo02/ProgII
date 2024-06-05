package Lektion23.ComparatorAndConsumer;

import java.util.*;
import java.util.function.Consumer;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};
    public static void main(String[] args)
    {
        // Hier den untenstehenden Comparator via Lambda-Ausdruck implementieren:

        List<String> allWords = Arrays.asList(alleWoerter);
        allWords.sort((s1, s2) -> {
            if (s1.length()<s2.length()) return -1;
            else if (s1.length()>s2.length()) return 1;
            return s1.compareTo(s2);
        });
        Consumer<String> printOut = string -> System.out.println(string);
        allWords.stream().forEach(printOut);







    }



}
