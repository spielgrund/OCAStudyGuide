package Aufgaben_05;

import java.util.Arrays;

public class Zeichenkette {
    public static void ZeichenketteAnalyse(String string){
        System.out.println(string);
        int[] intArr  = new int[200];
        for (int i = 0; i < string.length(); i++) {
            intArr[string.charAt(i)]++;
        }
        StringBuilder ausgabe = new StringBuilder();
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]!=0){
                ausgabe.append(Character.valueOf((char)i)).append(" = ").append(intArr[i]).append(System.getProperty("line.separator"));
            }
        }
        System.out.println(ausgabe);
    }

    public static void main(String[] args) {
        ZeichenketteAnalyse("Hallo");
    }
}
