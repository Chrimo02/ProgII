package Lektion22.BaumVisitor;

public class Main {
    public static void main(String[] args) {
        Baum<String> baum = new Baum<>();
        System.out.println(baum.size());
        baum.einfuegen("Ich bin ein Knoten");
        System.out.println(baum.size());
        baum.einfuegen("Ich bin auch 1 Knoten");
        System.out.println(baum.size());
        baum.einfuegen("A");
        baum.einfuegen("B");
        baum.einfuegen("C");
        baum.einfuegen("D");
        System.out.println(baum.size());

    }
}
