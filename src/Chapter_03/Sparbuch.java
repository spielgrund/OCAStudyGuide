package Chapter_03;

public class Sparbuch {
    private int kontonummer;
    private double kapital;
    private double zinssatz;

    public Sparbuch(){};

    public Sparbuch(int kontonummer, double kapital, double zinssatz){
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(double betrag){
        if(0 < betrag){
            kapital += betrag;
            System.out.println(betrag + " wurde eingezahlt. Neuer Kontostand ist : " + kapital);
        }
        else{
            System.out.println("Bitte Positiven Betrag einzahlen!");
        }
    }
    public void hebeAb(int betrag){
        if(0 < betrag && betrag <= kapital){
            kapital -= betrag;
            System.out.println(betrag + " wurde abgehoben. Neuer Kontostand ist : " + kapital);
        }
        else{
            System.out.println("Bitte Positiven Betrag einzahlen! Max Betrag ist: " + kapital);
        }
    }
    public double getErtrag(int laufzeitInJahren){
        double ertrag = 0;
        double kapitalMitZins = kapital;
        if(0 < laufzeitInJahren){
            for (int i = laufzeitInJahren; 0 < i ; i--) {
                kapitalMitZins += kapitalMitZins / 100 * zinssatz;
            }
            return Math.round((kapitalMitZins-kapital) * 100.0) / 100.0;
        }
        else{
            System.out.println("Laufzeit muss grösser als 0 sein!");
        }
        return 0;
    }
    public void verzinse(int laufzeitInJahren){
        double ertrag = getErtrag(laufzeitInJahren);
        kapital += ertrag;
        System.out.println("Die Zinsen von " + ertrag + " wurden dem Konto hinzugefügt.\n" +
                " Neuer Kontostand ist: " + kapital);
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getKapital() {
        return kapital;
    }

    public void setKapital(double kapital) {
        this.kapital = kapital;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    @Override
    public String toString() {
        return "Sparbuch{" +
                "kontonummer=" + kontonummer +
                ", kapital=" + kapital +
                ", zinssatz=" + zinssatz +
                '}';
    }
}
