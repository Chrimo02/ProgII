package Prüfungsvorbereitung.SS2020.Aufgabe4;


import Prüfungsvorbereitung.SS2020.Aufgabe3.ImmutableArrayList;

import java.util.ArrayList;
import java.util.List;

public class Spieldaten {
    int geld;
    ImmutableArrayList<String> spielerIDs;

    private Spieldaten(int geld, ImmutableArrayList<String> spielerIDs){
        this.geld = geld;
        this.spielerIDs = spielerIDs;
    }
    public static class SpieldatenBuilder{
        int geld;
        ArrayList<String> spielerIDs;
        public SpieldatenBuilder(){
            this.spielerIDs = new ArrayList<>();
        }
        public SpieldatenBuilder geld(int geld){
            this.geld = geld;
            return this;
        }
        public SpieldatenBuilder add(String id){
            this.spielerIDs.add(id);
            return this;
        }
        public Spieldaten build(){
            ImmutableArrayList<String> list = new ImmutableArrayList<>(spielerIDs);
            return new Spieldaten(this.geld,list);
        }
    }

    public static void main(String[] args) {
        Spieldaten.SpieldatenBuilder builder = new Spieldaten.SpieldatenBuilder();
        Spieldaten daten = builder.geld(1000).add("abc").add("xyz").build();

        for (String s : daten.spielerIDs) System.out.println(s);
        //daten.spielerIDs.add("bla");
    }
}
