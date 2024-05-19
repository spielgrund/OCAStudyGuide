package Aufgaben_04;

public class MonatTest {
    public static void main(String[] args) throws MonatsAusnahme {
        Monat m = new Monat(5);
        System.out.println(m.getMonatsname());
        Monat m13 = new Monat(13);
    }
}
