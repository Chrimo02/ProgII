package Lektion16.Stack;

import java.util.ArrayList;

public class StackIImpl implements StackI {

    ArrayList stack;
    public StackIImpl(){
        this.stack = new ArrayList(0);
    }
    @Override
    public void push(Object e){
        stack.add(e);
    }
    @Override
    public Object pop() {
        return stack.remove(stack.size() - 1);
    }


    /* Nachteile bei Verwendung von Veerbung:
            - Ein Stapel ist keine Liste, sondern eine eigene Datenstruktur ("Ist-ein"-Prinzip wird verletzt)
            - evtl. Probleme, wenn Methoden von ArrayList versehentlich überschrieben oder benutzt werden
     */


}
