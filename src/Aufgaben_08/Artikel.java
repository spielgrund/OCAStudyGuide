package Aufgaben_08;

import java.io.*;

public class Artikel implements Serializable {
    private static final long serialVersionUID = 1l;
    private int nr;
    private double preis;
    private int bestand;

    public Artikel(int nr, double preis, int bestand){
        this.nr = nr;
        this.preis = preis;
        this.bestand = bestand;
    }

    public Artikel(DataInputStream dis) throws IOException {
        this.nr = dis.readInt();
        this.preis = dis.readDouble();
        this.bestand = dis.readInt();
    }

    // Methode, die die Instanzvariablen in einen DataOutputStream schreibt
    public void writeToStream(DataOutputStream dos) throws IOException {
        dos.writeInt(nr);
        dos.writeDouble(preis);
        dos.writeInt(bestand);
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }




    @Override
    public String toString() {
        return "Artikel{" +
                "nr=" + nr +
                ", preis=" + preis +
                ", bestand=" + bestand +
                '}';
    }
}
