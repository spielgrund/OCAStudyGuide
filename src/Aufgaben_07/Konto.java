package Aufgaben_07;

public class Konto {

    private String inhaber;
    private double guthaben;

    public Konto(String inhaber, double guthaben){
        this.inhaber = inhaber;
        this.guthaben = guthaben;
    }



    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public double getGuthaben() {
        return guthaben;
    }

    public void setGuthaben(double guthaben) {
        this.guthaben = guthaben;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "Inhaber='" + inhaber + '\'' +
                ", Guthaben=" + guthaben +
                '}';
    }
}
