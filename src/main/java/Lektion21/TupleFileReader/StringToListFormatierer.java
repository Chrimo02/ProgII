package Lektion21.TupleFileReader;

import java.util.List;

public interface StringToListFormatierer<T> {
    public List<T> transform(String s);
}
