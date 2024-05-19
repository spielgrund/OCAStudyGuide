package Enaira;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var io = new IO();
        var rauschen = new Rauschen();

        int wdh = 11;

        String string = "Hallo Welt, dies ist eine Testnachricht. Schauen wir mal, ob es funktioniert!";
        String multiString = rauschen.multiString(wdh, string, 90);
        System.out.println(multiString);
        io.write("nachricht1.txt", wdh , multiString);

        String ergebniss = rauschen.rauschenEntfernen(io.readToArray("nachricht1.txt"));
        System.out.println("/////////////////////////////");
        System.out.println(new String(ergebniss));
    }
}
