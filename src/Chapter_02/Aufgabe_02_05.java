package Chapter_02;

public class Aufgabe_02_05 {
    public static boolean istTeilbar(int x, int y){
        return x % y == 0;
    }

    public static void main(String[] args) {
        System.out.println(istTeilbar(5,4));
        System.out.println(istTeilbar(36,6));
        System.out.println(istTeilbar(3,3));
        System.out.println(istTeilbar(100,10));
        System.out.println(istTeilbar(3,9));

    }
}
