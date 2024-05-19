package Aufgaben_06;

import java.util.HashSet;
import java.util.Set;

public class Aufgabe0614 {
    public static void main(String[] args) {
        Set<Konto> set = new HashSet<>();
        Konto k1 = new Konto(1234);
        Konto k2 = new Konto(2345);
        set.add(k1);
        set.add(k2);
        System.out.println(set);
        k2.setKontonummer(1234);
        System.out.println(set);
    }
}
