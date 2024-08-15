package Aufgaben_08;

public class Aufgaben_0817 {
    public static void main(String[] args) {
        Kunde kd = new Kunde("Hugo Meier", "Hauptstr. 12, 40880 Ratingen", null);
        Konto kto1 = new Konto(4711, 10000.);
        Konto kto2 = new Konto(4712, 999.);
        kd.setKonto(kto1);
        System.out.println(kd);

        Kunde kd2 = Clone.clone(kd);
        kd2.setKonto(kto2);
        System.out.println(kd2);
    }
}
