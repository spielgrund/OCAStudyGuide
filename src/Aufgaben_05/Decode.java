package Aufgaben_05;

public class Decode {
    public static String encode(String text){
        StringBuilder sb = new StringBuilder(text.toLowerCase());
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
           char temp = sb.charAt(i);
           int charint = (int) temp;
           if(96 < charint || charint < 123){
               sb2.append(Integer.toString(charint)+",");
           }
           else{
               sb2.append(temp);
           }

        }

        return sb2.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Hallo"));


    }
}
