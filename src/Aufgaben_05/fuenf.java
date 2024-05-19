package Aufgaben_05;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class fuenf {
    public static String[] extract(String text, String delim){
        Vector<String> vec = new Vector<>(List.of(text.split(" ")));
        //Collections.sort(vec);
        Comparator<String> c = Comparator.comparing(String::toString);
        vec.sort(c);

        return vec.toArray(new String[vec.size()]);
    }
}
