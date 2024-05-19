package Aufgaben_07;

public class Artikel {
    private int artikelnummer;

    private double preis;
    private int warengruppe;
    private int lagerbestand;

    public Artikel(int artikelnummer, double preis, int warengruppe, int lagerbestand) {
        this.artikelnummer = artikelnummer;
        this.preis = preis;
        this.warengruppe = warengruppe;
        this.lagerbestand = lagerbestand;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getWarengruppe() {
        return warengruppe;
    }

    public void setWarengruppe(int warengruppe) {
        this.warengruppe = warengruppe;
    }

    public int getLagerbestand() {
        return lagerbestand;
    }

    public void setLagerbestand(int lagerbestand) {
        this.lagerbestand = lagerbestand;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Artikel{");
        sb.append("artikelnummer=").append(artikelnummer);
        sb.append(", preis=").append(preis);
        sb.append(", warengruppe=").append(warengruppe);
        sb.append(", lagerbestand=").append(lagerbestand);
        sb.append('}');
        return sb.toString();
    }
}
