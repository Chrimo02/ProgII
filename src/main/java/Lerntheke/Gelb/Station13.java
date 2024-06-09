package Lerntheke.Gelb;

import java.util.ArrayList;
import java.util.List;

public class Station13 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hallo");
        strings.add("Welt");
        printOut(strings);
        strings.add("Baum");
        strings.add("Wald");
        printOut(strings);
    }
    public static void printOut(List<? extends Object> list){
        for (Object o : list) System.out.println(o);
    }
}
