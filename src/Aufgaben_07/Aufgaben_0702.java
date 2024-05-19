package Aufgaben_07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aufgaben_0702 {
    public static void main(String[] args) {
        final int zinzsatz = 5;
        Double[] guthaben = {5231.0,489561.0, 1000.0, 984561.0};

        for (double d : guthaben){
            System.out.println(d+(d/100*zinzsatz));
        }
        System.out.println();
        List<Double> doubleList = Arrays.stream(guthaben).map(x -> x + (x/100*zinzsatz)).collect(Collectors.toList());
        for (double d : doubleList){
            System.out.println(d);
        }
        System.out.println();
        Arrays.stream(guthaben).forEach(x -> System.out.println(x + (x/100*zinzsatz)));
        System.out.println();
        List<Double> guthabenList = Arrays.asList(guthaben);
        guthabenList.stream().map(x -> x + (x/100*zinzsatz)).forEach(System.out::println);
    }

}
