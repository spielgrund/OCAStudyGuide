package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Aufgabe_07_02 {
    public static void main(String[] args) {
        int[] guthaben = {1000,1523,25643,1532,8945};

        List<Double> verzinst = new ArrayList<>();
        for(int i : guthaben){
            System.out.println(i*1.03);
            verzinst.add(i*1.03);
        }
        System.out.println(verzinst);

        DoubleStream doubleStream = DoubleStream.of(1000,1523,25643,1532,8945);
        List<Double> verzinst2 = doubleStream.boxed().map(i -> i * 1.03).collect(Collectors.toList());

        List<Integer> verzinstint = Arrays.stream(guthaben).boxed()
                .map(i -> i + (i / 100 * 3 )).collect(Collectors.toList());
        System.out.println(verzinst2);
        System.out.println(verzinstint);

        Arrays.stream(guthaben).boxed().map(i -> i * 1.03).forEach(System.out::println);
    }
}
