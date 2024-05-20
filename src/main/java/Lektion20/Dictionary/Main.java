package Lektion20.Dictionary;

public class Main {
    public static void main(String[] args) {
        MultiMap englishGermanDictionary = new MultiMap();
        englishGermanDictionary.put("to clean","reinigen");
        englishGermanDictionary.put("to clean","säubern");
        englishGermanDictionary.put("to clean","putzen");
        englishGermanDictionary.put("to expand","vergrößern");
        englishGermanDictionary.put("to expand","wachsen");
        System.out.println(englishGermanDictionary.get("to clean"));
        System.out.println(englishGermanDictionary.get("to expand"));
    }
}
