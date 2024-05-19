package Aufgaben_05;

public class StringInvert {
    public static String StringInvert(String string){
        StringBuilder sb = new StringBuilder();
        for (int i = string.length()-1; 0 <= i ; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(StringInvert("Hallo, wie geht es Ihnen?"));
    }
}
