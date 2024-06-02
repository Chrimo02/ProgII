package Lektion22.BaumVisitor;
import Lektion22.BaumVisitor.Baum.Knoten;
public interface Visitor<T> {
    public void visit(Knoten<T> current);
}
