package Aufgaben_05;

public class ArtikelWarenkorbTest {
    public static void main(String[] args) {
        Artikel a1 = new Artikel(1, 2.99, 50);
        Artikel a2 = new Artikel(2, 1.99, 500);
        Artikel a3 = new Artikel(3, 0.49, 503);
        Warenkorb w = new Warenkorb();
        w.add(a1);
        w.add(a2);
        w.add(a3);
        System.out.println(w.bestellwert());
        System.out.println(2.99*50+1.99*500+0.49*503);
    }
}
