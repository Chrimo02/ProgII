package Lektion23.Bundesliga;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        // a)
        List<Mannschaft> mannschaftList = Mannschaft.createTabelle();

        // b)
        Consumer<Mannschaft> printOut = mannschaft -> System.out.println(mannschaft);
        //mannschaftList.stream().filter(mannschaft -> mannschaft.punkte > 50).forEach(printOut); // alle Teams mit über 50 Pkt.

        // c)
        Consumer<Mannschaft> printName = mannschaft -> System.out.println(mannschaft.name);
        //mannschaftList.stream().forEach(printName);  // alle Teamnamen

        // d)
        Predicate<Mannschaft> fFilter = letterFilter("F");
        Comparator<Mannschaft> alphabeticalComparator = Comparator.comparing(mannschaft -> mannschaft.name);
        //mannschaftList.stream().sorted(alphabeticalComparator).filter(fFilter).forEach(printName);

        // e)
        Comparator<Mannschaft> compareConcededGoals = Comparator.comparing(mannschaft -> mannschaft.gegentore);
        Optional<Mannschaft> mostConcededGoals = mannschaftList.stream().max(compareConcededGoals);
        mostConcededGoals.ifPresent(printOut);
    }
    private static Predicate<Mannschaft> letterFilter(String letter){
        return mannschaft -> mannschaft.name.startsWith(letter);
    }
}
