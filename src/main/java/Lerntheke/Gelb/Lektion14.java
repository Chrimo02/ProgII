package Lerntheke.Gelb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lektion14 {
    public static void printOutKeyValuePairs(Map<?, ?> map){
        //for (Map.Entry<?,?> entry : map.entrySet()) System.out.println(entry.getKey() + " " + entry.getValue()); //mögliche lösung
        for (Object o : map.keySet()) System.out.println(o + " " + map.get(o)); //bessere Lösung
    }
    public static List<Dozent> dozentenDieFachXUnterrichten(List<Dozent> dozenten, String x){
        List<Dozent> ergebnis = new ArrayList<>();
        for (Dozent d : dozenten){
            if (d.fach.equals(x)) ergebnis.add(d);
        }
        return ergebnis;
    }
}
