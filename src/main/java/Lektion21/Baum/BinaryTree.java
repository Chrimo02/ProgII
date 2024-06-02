package Lektion21.Baum;

public class BinaryTree<E> {
    Element<E> root;
    public BinaryTree(){
        this.root = null;
    }
    public void add(E element){
        root = addRecursive(root,element);
    }
    private Element<E> addRecursive(Element<E> temp, E element){
        if (temp == null) {
            return new Element<>(element);
        }
        if (((Comparable<E>) element).compareTo(temp.value) < 0){
            temp.setLeft(addRecursive(temp.getLeft(),element));
        }
        else if (((Comparable<E>) element).compareTo(temp.value) > 0){
            temp.setRight(addRecursive(temp.getRight(),element));
        }
        return temp;
    }
    /*
    public void print(){
        print(root);
    }
    private void print(Element<E> temp){
        if (temp.getLeft() != null) print(temp.getLeft());
        System.out.println(temp.value);
        if (temp.getRight() != null) print(temp.getRight());
    }

     */

    //leichter testbare print-Variante:
    public String print(){
        StringBuilder output = new StringBuilder();
        print(root, output);
        return output.toString().trim();
    }

    private void print(Element<E> temp, StringBuilder output){
        if (temp.getLeft() != null) print(temp.getLeft(), output);
        output.append(temp.value).append(" ");
        if (temp.getRight() != null) print(temp.getRight(), output);
    }

    static class Element<E>{
        E value;
        Element<E> left;
        Element<E> right;
        public Element(E value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
        public void setLeft(Element<E> element){
            this.left = element;
        }
        public void setRight(Element<E> element){
            this.right = element;
        }
        public Element<E> getLeft(){
            return this.left;
        }
        public Element<E> getRight(){
            return this.right;
        }
    }

}
