package Aufgaben_06;

import java.util.*;

public class Verzeichniss {
    private HashMap<String, String> hashMap = new HashMap<>();
    public void hinzufuegen(String key, String value){
        hashMap.put(key, value);
    }

    public void uebersetzten(String s){
        if(hashMap.containsKey(s)){
            System.out.println("dt: " + s + " en: " + hashMap.get(s));
        }
        else{
            System.out.println("Wort ist nicht im Verzeichniss!");
        }
    }

    public void alleDt(){
        List<String> keys = new ArrayList<>(hashMap.keySet());
        //Collections.sort(keys);
        System.out.println(keys);
    }

    public void alleEnSorted(){
        List<String> values = new ArrayList<>(hashMap.values());
        Collections.sort(values);
        System.out.println(values);
    }

    public void alleEn(){
        List<String> values = new ArrayList<>(hashMap.values());
        //Collections.sort(values);
        System.out.println(values);
    }



    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String s : hashMap.keySet()){
            sb.append("dt: ").append(s).append(" en: ").append(hashMap.get(s)).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
