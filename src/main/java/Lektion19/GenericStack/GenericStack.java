package Lektion19.GenericStack;


import java.util.ArrayList;

public class GenericStack<E> {
    ArrayList<E> stack;
    public GenericStack(){
        this.stack = new ArrayList<>();
    }
    public void push(E element) {
        stack.add(element);
    }

    public E pop() {
        return stack.remove(stack.size() - 1);
    }
}
