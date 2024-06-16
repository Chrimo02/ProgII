package Lektion21.TupleFileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToDouble implements StringToListFormatierer<Double> {
    public List<Double> transform(String str) {
        List<Double> result = new ArrayList<>();
        String[] values = str.split(",");
        for(String s : values){
            result.add(Double.valueOf(s));
        }
        return result;
    }
}
