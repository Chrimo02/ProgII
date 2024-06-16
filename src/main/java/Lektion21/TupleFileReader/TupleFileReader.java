package Lektion21.TupleFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TupleFileReader<T> {
    String dateipfad;
    public TupleFileReader(String dateipfad){
        this.dateipfad = dateipfad;
    }
    public List<Tuple<T>> readTupels(StringToListFormatierer<T> formatierer){
        List<Tuple<T>> result = new ArrayList<>();
        try (FileReader fr = new FileReader(dateipfad);
             BufferedReader br = new BufferedReader(fr))
        {
            String nextLine;
            while ((nextLine = br.readLine()) != null){
                String key = nextLine.substring(0,nextLine.indexOf(';'));
                String rest = nextLine.substring(nextLine.indexOf(";")+1);
                List<T> values = formatierer.transform(rest);
                result.add(new Tuple<>(key,values));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
