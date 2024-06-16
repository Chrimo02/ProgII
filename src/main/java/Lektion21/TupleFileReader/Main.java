package Lektion21.TupleFileReader;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TupleFileReader<Integer> intReader = new TupleFileReader<>("/Users/christian/IdeaProjects/ProgII/src/main/java/Lektion21/TupleFileReader/gruppeneinteilung.txt");
        List<Tuple<Integer>> intTupleList = intReader.readTupels(new StringToInteger());
        for (Tuple<Integer> t : intTupleList) {
            System.out.println(t.getKey() + " " + t.getValues());
        }
    }
}
