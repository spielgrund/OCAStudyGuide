package Aufgaben_07;

import java.util.Calendar;
import java.util.Comparator;


public class Termin{
    private String beschreibung;
    private String ort;
    private Calendar zeit;

    public Termin(String beschreibung, String ort, int jahr, int monat, int tag){
        this.beschreibung = beschreibung;
        this.ort = ort;
        this.zeit = Calendar.getInstance();
        zeit.set(jahr, monat, tag);
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Calendar getZeit() {
        return zeit;
    }

    public void setZeit(Calendar zeit) {
        this.zeit = zeit;
    }

    @Override
    public String toString() {
        return "Termin{" +
                "beschreibung='" + beschreibung + '\'' +
                ", ort='" + ort + '\'' +
                ", zeit=" + zeit.get(1) + "." + String.format("%02d", zeit.get(2)) + "." + String.format("%02d", zeit.get(5)) +
                '}';
    }
}
