package Aufgaben_07;

import java.util.stream.Stream;

public class Aufgaben_0713 {
    public static void main(String[] args) {
        int n = 0;
        int maxsize = 10;

        for (int i = 0; i < 5; i++) {
            Stream<Integer> integerStream = Stream.iterate(1, x -> x + 1).map(x -> x*x);
            Stream<Integer> streamBlock = integerStream.skip(n).limit(maxsize);
            n += maxsize;
            System.out.println(streamBlock.toList());

        }
    }
}
