package Aufgaben_07;

import Aufgaben_07.Artikel;

import java.util.List;

public class Aufgaben_0708 {

    public static void main(String[] args) {
        Artikel a1 = new Artikel(1, 2.99,1,500);
        Artikel a2 = new Artikel(2, 0.99,1,5000);
        Artikel a3 = new Artikel(3, 1.99,2,300);
        Artikel a4 = new Artikel(4, 2.99,2,500);
        Artikel a5 = new Artikel(5, 0.99,3,1000);

        List<Artikel> artikelList = List.of(a1, a2, a3, a4, a5);

        artikelList.stream().filter(a -> a.getWarengruppe() == 1).forEach(System.out::println);
        System.out.println();
        artikelList.stream().filter(a -> a.getLagerbestand() > 600).forEach(System.out::println);
        System.out.println();
        artikelList.stream().filter(a -> a.getPreis() > 1.0).forEach(System.out::println);

    }


}
