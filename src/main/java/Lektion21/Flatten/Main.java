package Lektion21.Flatten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<>();
        List<String> liste2 = new ArrayList<>();
        List<String> liste3 = new ArrayList<>();
        liste1.add("Hallo");
        liste1.add("Welt");
        liste2.add("Tor für Deutschland!");
        liste2.add("Major Tom");
        liste3.add("Europameister");
        List<List<String>> list = new ArrayList<>();
        list.add(liste1);
        list.add(liste2);
        list.add(liste3);
        List<String> list4 = flatten(list);
        for (String s : list4) System.out.println(s);

    }

     */

    public static <T> List<T> flatten(List<List<T>> input){
        List<T> output = new ArrayList<>();
        for (List<T> list : input){
            for (T x : list) output.add(x);
        }
        return output;
    }
}
