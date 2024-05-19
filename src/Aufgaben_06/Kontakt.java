package Aufgaben_06;

public class Kontakt implements Comparable<Kontakt>{
    private String vorname;
    private String nachname;
    private String handynummer;

    public Kontakt(String vorname, String nachname, String handynummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.handynummer = handynummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getHandynummer() {
        return handynummer;
    }

    public void setHandynummer(String handynummer) {
        this.handynummer = handynummer;
    }

    @Override
    public String toString() {
        return "Kontakt{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", handynummer='" + handynummer + '\'' +
                '}';
    }

    @Override
    public int compareTo(Kontakt k) {
        return nachname.compareToIgnoreCase(k.getNachname());
    }
}
