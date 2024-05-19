package Aufgaben_05;

public class Kunde implements Comparable<Kunde>{
    private String name;
    private String adresse;

    public Kunde(){}

    public Kunde(String name, String adresse){
        this.name = name;
        this.adresse = adresse;
    }
    public Kunde(Kunde other){
        this.name = other.name;
        this.adresse = other.adresse;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public int compareTo(Kunde k) {
        return name.compareTo(k.getName());
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
