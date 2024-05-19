package Lambdas;

import java.util.Arrays;

public class Aufgabe_07_01 {
    public static void main(String[] args) {
        String[] arr = {"Peterpopel","Luilurch","Agathagamon"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(Arrays.toString(arr));
    }
}
