package Aufgaben_08;

//Fügen Sie der Klasse Artikel eine Methode hinzu, die die Werte der instanzvariablen
//dieses Objekts (this) in einen DataOutputStream schreibt. Erstellen Sie dann einen Konstruktor,
//der die Instanzvariable für das neue Objekt aus einem DatainputStream liest.

import java.io.*;

public class Aufgaben_0806 {
    public static void main(String[] args) {
        try {
            // Erstellen eines Artikels
            Artikel artikel = new Artikel(1, 2.99, 100);

            // Schreiben des Artikels in eine Datei
            FileOutputStream fos = new FileOutputStream("artikel.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            artikel.writeToStream(dos);
            dos.close();

            // Lesen des Artikels aus der Datei
            FileInputStream fis = new FileInputStream("artikel.dat");
            DataInputStream dis = new DataInputStream(fis);
            Artikel gelesenerArtikel = new Artikel(dis);
            dis.close();

            // Ausgabe des gelesenen Artikels
            System.out.println(gelesenerArtikel);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
