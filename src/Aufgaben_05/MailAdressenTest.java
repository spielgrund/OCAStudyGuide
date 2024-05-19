package Aufgaben_05;

public class MailAdressenTest {
    public static void main(String[] args) {
        MailAdressen ma = new MailAdressen("mailadressen.txt");
//        ma.hinzufuegen("Peter Lustig", "peter@lustig.de");
//        ma.hinzufuegen("Peter Frustig", "peter@frustig.de");
//        ma.hinzufuegen("Peter Hastig", "peter@hastig.de");
//        System.out.println(ma);
//        ma.schreiben();
        ma.einlesen();
        System.out.println(ma);

    }
}
