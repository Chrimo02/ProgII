package Lektion20.SMS;

import java.util.*;

public class TastenMap {
    Map<ArrayList<Character>, Character> tastenZuordnung;

    public TastenMap(){
        this.tastenZuordnung = new HashMap<>();
        tastenZuordnung.put(new ArrayList<>(Arrays.asList('A','B','C')),'2');
        tastenZuordnung.put(new ArrayList<>(Arrays.asList('D','E','F')),'3');
        tastenZuordnung.put(new ArrayList<>(Arrays.asList('G','H','I')),'4');
        tastenZuordnung.put(new ArrayList<>(Arrays.asList('J','K','L')),'5');
        tastenZuordnung.put(new ArrayList<>(Arrays.asList('M','N','O')),'6');
        tastenZuordnung.put(new ArrayList<>(Arrays.asList('P','Q','R','S')),'7');
        tastenZuordnung.put(new ArrayList<>(Arrays.asList('T','U','V')),'8');
        tastenZuordnung.put(new ArrayList<>(Arrays.asList('W','X','Y','Z')),'9');
    }
    public char get(char c)throws IllegalTelephoneNumberException{
        for(Map.Entry<ArrayList<Character>, Character> entry : tastenZuordnung.entrySet()){
            if (entry.getKey().contains(c)){
                return entry.getValue();
            }
        }
        throw new IllegalTelephoneNumberException("Ungültige Telefonnummer, Es können nur Buchstaben von A-Z eingelesen werden!");
    }

}
