package Aufgaben_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Eins", 1);
        hashMap.put("Zwei", 2);
        hashMap.put("Drei", 3);
        System.out.println(hashMap);

        //1
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        System.out.println("/////////////////////");
        //2
        for (String s: hashMap.keySet()){
            System.out.println(s + "," + hashMap.get(s));
        }
        System.out.println("/////////////////////");
        //3
        hashMap.forEach((key, value) -> System.out.println("Key=" + key + ", Value=" + value));
        System.out.println("/////////////////////");
        //4
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
        System.out.println("///////////////////////////");
        Iterator<String> jt = hashMap.keySet().iterator();
        while(jt.hasNext()){
            String s = jt.next();
            System.out.println(s + "," + hashMap.get(s));
        }


    }

}



