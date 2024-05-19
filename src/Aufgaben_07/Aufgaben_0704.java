package Aufgaben_07;

import java.util.Arrays;
import java.util.Comparator;

public class Aufgaben_0704 {
    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);
        Arrays.stream(args).map(s -> Integer.parseInt(s)).sorted().forEach(System.out::println);
        System.out.println();
        Arrays.stream(args).map(s -> Integer.parseInt(s)).sorted((i1,i2)-> i1.compareTo(i2)).forEach(System.out::println);
    }
}
