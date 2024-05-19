package Chapter_02;

import java.time.YearMonth;

public class Aufgabe_02_08 {
    public static int berechneQuerSumme(int i){
        int quersumme = 0;
        String[] zahlenfolge = Integer.toString(i).split("");
        for(String s : zahlenfolge){
            quersumme += Integer.parseInt(s);
        }
        return quersumme;
    }

    public static void main(String[] args) {
        System.out.println(berechneQuerSumme(1));
        System.out.println(berechneQuerSumme(12));
        System.out.println(berechneQuerSumme(1123));
        System.out.println(berechneQuerSumme(14532));

    }
}
