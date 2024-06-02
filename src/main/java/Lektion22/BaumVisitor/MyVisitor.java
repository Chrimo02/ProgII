package Lektion22.BaumVisitor;
import Lektion22.BaumVisitor.Baum.Knoten;
public class MyVisitor<T> implements Visitor<T> {

    int anzahlKnoten;
    public void visit(Knoten<T> current){
        this.anzahlKnoten++;
    }
}
