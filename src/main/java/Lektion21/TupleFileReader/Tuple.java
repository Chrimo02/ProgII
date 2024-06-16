package Lektion21.TupleFileReader;

import java.lang.reflect.Type;
import java.util.List;

public class Tuple <T>{
    private String key;
    private List<T> values;

    public Tuple(String key, List<T> second){
        this.key = key;
        this.values = second;
    }
    public String getKey() {
        return key;
    }

    public List<T> getValues() {
        return values;
    }

}
