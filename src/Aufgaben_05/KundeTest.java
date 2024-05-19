package Aufgaben_05;

import java.util.Arrays;

public class KundeTest {
    public static void main(String[] args) {
        Kunde[] arrKunde = new Kunde[3];
        Kunde k0 = new Kunde("Peter", "Strasse 1");
        Kunde k1 = new Kunde("Hans", "Strasse 2");
        Kunde k2 = new Kunde("Abdel", "Strasse 3");
        arrKunde[0] = k0;
        arrKunde[1] = k1;
        arrKunde[2] = k2;
        System.out.println(Arrays.toString(arrKunde));

        Arrays.sort(arrKunde);
        System.out.println(Arrays.toString(arrKunde));

    }
}
