package Aufgaben_07;

import java.util.stream.Stream;

public class Aufgaben_0714 {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.iterate(1,x -> x + 1).limit(100);
        System.out.println(intStream.mapToInt( i -> i.intValue()).sum());
    }
}
