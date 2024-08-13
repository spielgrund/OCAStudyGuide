package Aufgaben_08;



import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Mitarbeiter implements Serializable {
    private int persid;
    private String name;
    private LocalDate geburtsDatum;
    private Adresse adresse;

    private List<Kontakt> kontakte = new ArrayList<>();

    public int getPersid() {
        return persid;
    }

    public void setPersid(int persid) {
        this.persid = persid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Kontakt> getKontakte() {
        return kontakte;
    }

    public void setKontakte(Kontakt kontakte) {
        this.kontakte.add(kontakte);
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "persid=" + persid +
                ", name='" + name + '\'' +
                ", geburtsDatum=" + geburtsDatum +
                ", adresse=" + adresse +
                ", kontakte=" + (kontakte) +
                '}';
    }
}
////////////////////////////////////////////////////////////////////////////







