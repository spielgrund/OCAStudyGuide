package Aufgaben_05;

public class Artikel {
    private int id;
    private double preis;
    private int menge;

    public Artikel(int id, double preis, int menge){
        this.id = id;
        this.preis = preis;
        this.menge = menge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "id=" + id +
                ", preis=" + preis +
                ", menge=" + menge +
                '}';
    }
}
