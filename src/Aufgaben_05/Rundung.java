package Aufgaben_05;

public class Rundung {
    public static float round(float x, int digits){
        return (float) (Math.round(x*Math.pow(10,digits))/Math.pow(10,digits));
    }
    public static double round(double x, int digits){
        return Math.round(x*Math.pow(10,digits))/Math.pow(10,digits);
    }

    public static void main(String[] args) {
        System.out.println(round(123.456f, 2));
        System.out.println(round(123.45678, 3));
    }
}
