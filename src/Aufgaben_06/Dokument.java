package Aufgaben_06;

public class Dokument {
    private String titel;
    private int seitenzahl;

    public Dokument(String titel, int seitenzahl) {
        this.titel = titel;
        this.seitenzahl = seitenzahl;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getSeitenzahl() {
        return seitenzahl;
    }

    public void setSeitenzahl(int seitenzahl) {
        this.seitenzahl = seitenzahl;
    }

    @Override
    public String toString() {
        return "Dokument{" +
                "titel='" + titel + '\'' +
                ", seitenzahl=" + seitenzahl +
                '}';
    }
}
