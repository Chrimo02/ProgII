package Lektion21.TupleFileReader;

import java.util.ArrayList;
import java.util.List;

public class StringToInteger implements StringToListFormatierer<Integer> {


        public List<Integer> transform(String str) {
            List<Integer> result = new ArrayList<>();
            String[] values = str.split(",");
            for(String s : values){
                result.add(Integer.valueOf(s));
            }
            return result;
        }

}
