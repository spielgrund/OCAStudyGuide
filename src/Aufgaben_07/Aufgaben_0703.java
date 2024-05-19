package Aufgaben_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aufgaben_0703 {
    public static void main(String[] args) {
        final int zinzsatz = 5;

        List<Double> guthaben = List.of(5231.0,489561.0, 1000.0, 984561.0);
        List<Double> guthabenMitZinsen = new ArrayList<>();
        for(Double d: guthaben){
            guthabenMitZinsen.add(d+(d/100*zinzsatz));
        }
        double guthabenMitZinsenGesamt = 0;
        for (Double d : guthabenMitZinsen){
            guthabenMitZinsenGesamt += d;
        }
        System.out.println(guthabenMitZinsenGesamt);
        System.out.println();
        double guthabenMitZinsenGesamt2 = guthaben.stream()
                .map(x -> x + (x/100*zinzsatz))
                .reduce(0., (x,y) -> x + y);
        System.out.println(guthabenMitZinsenGesamt2);
    }
}
