package Prüfungsvorbereitung.SS2020.Aufgabe3;

import java.util.ArrayList;
import java.util.Collection;

public class ImmutableArrayList<E> extends ArrayList<E> {
    public ImmutableArrayList(Collection<? extends E> c){
        super(c);
    }
    public boolean add(E e){
        throw new java.lang.UnsupportedOperationException("this list is immutable, no elements can be added after initialization");
    }


}
