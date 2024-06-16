package Prüfungsvorbereitung.SS2020.Aufgabe1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Konfigurator {
    public static List<String> liesKonfigurationsdatei() {
        List<String> konfiguration = new ArrayList<>();
        konfiguration.add("mail.transport.protocol=smtp");
        konfiguration.add("mail.smtp.port=465");
        konfiguration.add("password=K[O8a}5#");
        return konfiguration;
    }
    public static Map<String, String> mapKonfiguration(){
        List<String> input = liesKonfigurationsdatei();
        Map<String, String> result = new HashMap<>();
        for(String s : input){
            int divider = s.indexOf('=');
            String temp1 = s.substring(0,divider);
            String temp2 = s.substring(divider+1);
            result.put(temp1,temp2);
        }
        return result;
    }

    public static void main(String[] args) {
        mapKonfiguration();
    }

}
