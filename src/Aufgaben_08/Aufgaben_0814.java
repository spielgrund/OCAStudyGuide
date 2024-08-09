package Aufgaben_08;

import java.io.IOException;

public class Aufgaben_0814 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Artikel a1 = new Artikel(1, 2.99, 500);
        Artikel a2 = new Artikel(2, 0.99, 100);
        System.out.println(a1);
        System.out.println(a2);
        a1.store("artikel.ser");
        a2 = a2.load("artikel.ser");

        System.out.println(a1);
        System.out.println(a2);
    }
}
