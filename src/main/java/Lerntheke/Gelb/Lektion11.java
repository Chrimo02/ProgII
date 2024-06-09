package Lerntheke.Gelb;

import java.util.ArrayList;
import java.util.List;

public class Lektion11 {
    public static List<String> erzeugeListe() {
        return new ArrayList<>();
    }

    public static String verarbeiteListe(ArrayList<String> list) {
        String result = "";
        for (String string : list)
            result += string;
        return result;
    }

    public static void main(String[] args) {
        List<String> liste = erzeugeListe();
        //verarbeiteListe(liste); //nicht möglich eine List kann nicht anstelle einer ArrayList verwendet werden. }
    }
}
