package Lerntheke.Gelb;

public class Lektion12 {
    public class Mannschaft implements Comparable<Mannschaft>{
        String name;
        int anzahlGespielteSpiele;
        int tore;
        int gegetore;
        int punkte;

        @Override
        public int compareTo(Mannschaft o) {
            return this.name.compareTo(o.name);
        }
    }
}
