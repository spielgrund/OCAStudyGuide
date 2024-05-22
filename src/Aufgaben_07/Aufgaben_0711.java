package Aufgaben_07;

import java.util.TreeMap;

public class Aufgaben_0711 {
    public static void main(String[] args) {
        TreeMap<Integer, Konto> treeMap = new TreeMap<Integer, Konto>();
        Konto k1 = new Konto("Herr Peters", 5000);
        Konto k2 = new Konto("Herr Franz", 1234);
        Konto k3 = new Konto("Herr Hans", 5839);

        treeMap.put(1234,k1);
        treeMap.put(1235,k2);
        treeMap.put(1236,k3);

        treeMap.forEach((nr, konto) -> System.out.println(nr + " -> " + konto.getGuthaben()));

        System.out.println();

        double sum = treeMap.values().stream().map(konto -> konto.getGuthaben())
                .reduce(0., (x,y)-> x + y);
        System.out.println("Das Durchschnittsguthaben beträgt: "
                + String.format("%.2f", (sum/treeMap.size())));

        System.out.println();

        treeMap.values().stream().filter(konto -> konto.getGuthaben() > 2000)
                .forEach(konto -> System.out.println(konto.getInhaber()));

        }
}
