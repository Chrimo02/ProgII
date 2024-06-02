package Lektion22.BaumVisitor;


public class Baum<E extends Comparable<E>> {
    public static class Knoten<E>
    {
        Knoten<E> left;
        Knoten<E> right;
        E content;
        public Knoten(E content){
            this.content = content;
            this.left = null;
            this.right = null;
        }
    }
    Knoten<E> root;
    public void einfuegen(E content) {
        root = addRecursive(root,content);
    }
    private Knoten<E> addRecursive(Knoten<E> temp, E element){
        if (temp == null) {
            return new Knoten<>(element);
        }
        if (element.compareTo(temp.content) < 0){
            temp.left = addRecursive(temp.left,element);
        }
        else if (element.compareTo(temp.content) > 0){
            temp.right = addRecursive(temp.right,element);
        }
        return temp;
    }
    protected void traversiere(Visitor<E> visitor)
    {
        if (root == null) return;
        else traversiere(root, visitor);
    }
    protected void traversiere(Knoten<E> current, Visitor<E> visitor)
    {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }
    public int size(){
        MyVisitor<E> visitor = new MyVisitor<>();
        this.traversiere(visitor);
        return visitor.anzahlKnoten;
    }
}
