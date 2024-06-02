package Lektion22.PrimzahlThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlThread extends Thread{
    List<Integer> zahlenZumTesten;
    Map<Integer, Boolean> ergebnis;
    public PrimzahlThread(List<Integer> zahlenZumTesten) {
        this.zahlenZumTesten = zahlenZumTesten;
        this.ergebnis = new HashMap<>();
    }
    public Map<Integer, Boolean> getErgebnis(){
        return this.ergebnis;
    }
    public static boolean testeObPrimzahl(int zahl) {
        if (zahl == 0 || zahl == 1) return false;
        for (int i = zahl-1; i>1; i--){
            if (zahl % i == 0) return false;
        }
        return true;
    }
    @Override
    public void run() {
        for(Integer i : this.zahlenZumTesten){
            if (testeObPrimzahl(i)) ergebnis.put(i,true);
            else ergebnis.put(i,false);
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Boolean> entry : this.ergebnis.entrySet()){
            sb.append(entry.getKey());
            sb.append(" -> ");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();
        List<Integer> integerList3 = new ArrayList<>();
        for (int i = 0; i<25;i++){
            integerList1.add(i);
        }
        for (int i = 26; i<50;i++){
            integerList2.add(i);
        }
        for (int i = 51; i<100;i++){
            integerList3.add(i);
        }
        PrimzahlThread t1 = new PrimzahlThread(integerList1);
        PrimzahlThread t2 = new PrimzahlThread(integerList2);
        PrimzahlThread t3 = new PrimzahlThread(integerList3);

        try{
            t1.start();
            t2.start();
            t3.start();
            t1.join();
            t2.join();
            t3.join();

            Map<Integer, Boolean> mainMap = new HashMap<>();
            mainMap.putAll(t1.getErgebnis());
            mainMap.putAll(t2.getErgebnis());
            mainMap.putAll(t3.getErgebnis());

            for (Map.Entry<Integer, Boolean> entry : mainMap.entrySet()){
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
