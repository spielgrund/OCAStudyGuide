package Aufgaben_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aufgabe0608 {

    public static void printList(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Eins");
        list.add("Zwei");
        list.add("Drei");

        printList(list);


    }
}
