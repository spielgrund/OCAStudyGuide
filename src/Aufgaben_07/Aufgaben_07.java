package Aufgaben_07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Aufgaben_07 {
    public static void main(String[] args) {
        String[] stringArr = new String[5];
        stringArr[0]= "Hallo";
        stringArr[1]= "A";
        stringArr[2]= "Hallo du!";
        stringArr[3]= "Wie geht es ihnen?";
        stringArr[4]= "drei";

        Comparator<String> comp = Comparator.comparingInt(String::length);
        Comparator<String> comp1 = (x,y) -> x.length()-y.length();
        Arrays.sort(stringArr, comp1);
        for(String s:stringArr){
            System.out.println(s);
        }
    }
}
