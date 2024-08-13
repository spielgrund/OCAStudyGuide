package Aufgaben_08;

class Telefon extends Kontakt{
    String telefonNummer;

    public Telefon(String telefonNummer){
        this.telefonNummer = telefonNummer;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(String telefonNummer) {
        this.telefonNummer = telefonNummer;
    }

    public String getInfo(){
        return telefonNummer;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "telefonNummer='" + telefonNummer + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
