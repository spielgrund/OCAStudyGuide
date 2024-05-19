package Aufgaben_05;

import java.util.*;

public class Fuenf2 {
    public static String[] extract(String text, String delim){
        Vector<String> vec = new Vector<>(List.of(text.split(" ")));
        //Collections.sort(vec);
        Comparator<String> c = Comparator.comparing(String::toString);
        vec.sort(c);


        Set<String> mySet = new HashSet<String>(vec);

        for(String s: mySet){
            System.out.println(s + " " + Collections.frequency(vec,s));
        }

        return vec.toArray(new String[vec.size()]);
    }
}
