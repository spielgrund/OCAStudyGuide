package Aufgaben_06;

import java.util.Arrays;

public class KontaktTest {
    public static void main(String[] args) {
        Kontakt k1 = new Kontakt("Herr", "A", "1234");
        Kontakt k2 = new Kontakt("Herr", "Cuina", "1234");
        Kontakt k3 = new Kontakt("Herr", "Bert", "1234");
        Kontakt[] kArr = {k1,k2,k3};
        System.out.println(Arrays.toString(kArr));
        Arrays.sort(kArr);
        System.out.println(Arrays.toString(kArr));
    }
}
