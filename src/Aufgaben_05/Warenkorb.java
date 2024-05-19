package Aufgaben_05;

import java.util.Vector;

public class Warenkorb {
    Vector<Artikel> artikelVector = new Vector<>();

    public void add(Artikel artikel){
        artikelVector.add(artikel);
    }
    public double bestellwert(){
        double bestellwert = 0;
        for(Artikel a: artikelVector){
            bestellwert += a.getMenge()*a.getPreis();
        }
        return bestellwert;
    }

}
