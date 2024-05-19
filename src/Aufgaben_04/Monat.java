package Aufgaben_04;

import java.util.HashMap;

public class Monat {
    private int monat;

    static HashMap<Integer, String> hashMap = new HashMap<>();
    static {
        hashMap.put(1, "Januar");
        hashMap.put(2, "Februar");
        hashMap.put(3, "März");
        hashMap.put(4, "April");
        hashMap.put(5, "Mai");
        hashMap.put(6, "Juni");
        hashMap.put(7, "Juli");
        hashMap.put(8, "August");
        hashMap.put(9, "September");
        hashMap.put(10, "Oktober");
        hashMap.put(11, "November");
        hashMap.put(12, "Dezember");

    }

    public Monat(int monat) throws MonatsAusnahme{
        if(monat < 1 || 12 < monat){
            throw new MonatsAusnahme(monat + " liegt ausserhalb von 1-12");
        }
        else{
            this.monat = monat;
        }
    }

    public String getMonatsname(){
        return hashMap.get(monat);
    }

}
