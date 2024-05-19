package Aufgaben_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aufgabe0610 {
//    public static <T extends Comparable<? super T>> void sort(List<T> list){
//
//    }
    public static void main(String[] args) {
        ArrayList<Konto> arrayList = new ArrayList<>();
        arrayList.addAll(List.of(new Konto(2345),new Konto(1234),new Konto(3456)));
        System.out.println(arrayList);
        arrayList.sort(Konto::compareTo);
        System.out.println(arrayList);
    }
}
