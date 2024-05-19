package Aufgaben_05;

public class RateMyPassword {
    public static int RateMyPassword(String string){
        int score = 0;
        if(string.matches(".*\\d.*")){score++;}
        if(string.matches(".*[a-z].*")) {score++;}
        if(string.matches(".*[A-Z].*")) {score++;}
        if(string.matches(".*\\p{Punct}.*")) {score++;}
        if(string.length()>=8) {score++;}

        return score;
    }

    public static void main(String[] args) {
        System.out.println(RateMyPassword("bbbbbbbbbaA1!"));
    }
}
