package Aufgaben_07;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Aufgaben_0706 {
    public static void main(String[] args) {
        int fakultaet = 31;
        Stream<BigInteger> bigIntegerStream = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE)); // Infinite stream of BigIntegers starting from 0

        // Limit the stream to produce only the first 5 elements
        Stream<BigInteger> limitedStream = bigIntegerStream.limit(fakultaet);

        // Display the elements of the limited stream
        BigInteger b = limitedStream.reduce(BigInteger.ONE, (x,y) -> x.multiply(y));
        System.out.println(b);
    }
}
