package Aufgaben_05;

public class Palindrom {
    public static boolean Palindrom(String string){
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)!=string.charAt(string.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrom("Hallah"));
    }
}
