package Aufgaben_07;

import java.time.LocalDate;

public class Person {
    private String vorname;
    private String nachname;
    private LocalDate geburtstag;
    private String wohnort;
    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, String wohnort){
        this.vorname = vorname;
        this.nachname = nachname;
        this.wohnort = wohnort;
    }

    public Person(String vorname, String nachname,int jahr,int monat, int tag){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = LocalDate.of(jahr,monat,tag);
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

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(LocalDate geburtstag) {
        this.geburtstag = geburtstag;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    @Override
    public String toString() {
        if(geburtstag == null) {
            final StringBuffer sb = new StringBuffer("Person{");
            sb.append("vorname='").append(vorname).append('\'');
            sb.append(", nachname='").append(nachname).append('\'');
            sb.append('}');
            return sb.toString();
        }
        else{
            final StringBuffer sb = new StringBuffer("Person{");
            sb.append("vorname='").append(vorname).append('\'');
            sb.append(", nachname='").append(nachname).append('\'');
            sb.append(", Geburtstag='").append(geburtstag.toString()).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
