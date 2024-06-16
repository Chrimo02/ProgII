package Lektion21.Flatten;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static Lektion21.Flatten.Main.flatten;
import static org.junit.jupiter.api.Assertions.*;
public class FlattenTest {

    /*
        Sinnvolle Testfälle für die Flatten-Methode:
            - Test mit leerer Liste von Listen
            - Test mit einer Liste von Listen, die aber alle leer sind
            - Test mit Listen von verschiedenen Datentypen
            - Test mit Liste von Listen, von denen nur manche Inhalte haben und machne hingegen leer sind
            - Test mit Liste von Listen, deren Elemente weitere Listen sind
     */
    @Test
    public void testFlattenGeneric_EmptyList() {
        List<List<String>> listOfStringLists = new ArrayList<>();
        List<String> result = flatten(listOfStringLists);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void testFlattenGeneric_ListOfEmptyLists() {
        List<List<String>> listOfStringLists = new ArrayList<>();
        listOfStringLists.add(new ArrayList<>());
        listOfStringLists.add(new ArrayList<>());
        List<String> result = flatten(listOfStringLists);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void testFlattenGeneric_ListOfStringLists() {
        List<List<String>> listOfStringLists = new ArrayList<>();
        listOfStringLists.add(List.of("a", "b", "c"));
        listOfStringLists.add(List.of("d", "e", "f"));
        List<String> result = flatten(listOfStringLists);
        List<String> expected = List.of("a", "b", "c", "d", "e", "f");
        assertEquals(expected, result);
    }

    @Test
    public void testFlattenGeneric_ListOfIntegerLists() {
        List<List<Integer>> listOfIntegerLists = new ArrayList<>();
        listOfIntegerLists.add(List.of(1, 2, 3));
        listOfIntegerLists.add(List.of(4, 5, 6));
        List<Integer> result = flatten(listOfIntegerLists);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(expected, result);
    }

    @Test
    public void testFlattenGeneric_ListOfDoubleLists() {
        List<List<Double>> listOfDoubleLists = new ArrayList<>();
        listOfDoubleLists.add(List.of(1.1, 2.2, 3.3));
        listOfDoubleLists.add(List.of(4.4, 5.5, 6.6));
        List<Double> result = flatten(listOfDoubleLists);
        List<Double> expected = List.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6);
        assertEquals(expected, result);
    }

    @Test
    public void testFlattenGeneric_MixedEmptyAndNonEmptyLists() {
        List<List<String>> listOfStringLists = new ArrayList<>();
        listOfStringLists.add(List.of("a", "b"));
        listOfStringLists.add(new ArrayList<>());
        listOfStringLists.add(List.of("c", "d"));
        List<String> result = flatten(listOfStringLists);
        List<String> expected = List.of("a", "b", "c", "d");
        assertEquals(expected, result);
    }
}
