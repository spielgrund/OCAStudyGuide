package Aufgaben_06;

public class VerzeichnissTest {
    public static void main(String[] args) {
        Verzeichniss verzeichniss = new Verzeichniss();
        verzeichniss.hinzufuegen("Haus", "house");
        verzeichniss.hinzufuegen("Test", "test");
        verzeichniss.hinzufuegen("ABC", "abc");
        verzeichniss.hinzufuegen("Programm", "programm");
        verzeichniss.hinzufuegen("eins", "one");

        System.out.println(verzeichniss);
        verzeichniss.alleDt();
        verzeichniss.alleEn();
        verzeichniss.alleEnSorted();
        verzeichniss.uebersetzten("Haus");
    }
}
