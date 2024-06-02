package Lektion21.Baum;

public class Main {

    public static void main(String[] args) {
        BinaryTree<String> stringTree = new BinaryTree<>();
        stringTree.add("Hallo");
        stringTree.add("Welt");
        stringTree.add("Fisch");
        stringTree.add("Baum");
        stringTree.add("HoneyBadger");
        stringTree.add("JesusChristLizard");
        stringTree.add("Sloth");
        stringTree.print();
    }
}
