package Aufgaben_07;

import java.util.List;

public class Aufgaben_0712 {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,5,2,6,3,7,4,8,5,9,6,0,7,8,9,0,1,1,1,2,3,4);
        intList.stream().sorted().distinct().forEach(System.out::println);
    }
}
