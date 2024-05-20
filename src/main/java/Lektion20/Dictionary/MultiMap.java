package Lektion20.Dictionary;

import java.util.*;

public class MultiMap {
    Map<String, List<String>> multimap;

    MultiMap(){
        this.multimap = new HashMap<>();
    }
    public void put(String englisch, String deutsch){
        if (this.multimap.containsKey(englisch)){
            this.multimap.get(englisch).add(deutsch);
        }
        else {
            List<String> bedeutungen = new ArrayList<>();
            bedeutungen.add(deutsch);
            this.multimap.put(englisch,bedeutungen);
        }
    }
    public List<String> get(String englisch){
        return multimap.get(englisch);
    }

}
