package Aufgaben_07;

import java.util.Arrays;
import java.util.Calendar;
import java.util.function.Predicate;

public class Aufgabe_0710 {
    public static void main(String[] args) {
        Termin t1 = new Termin("Zahnarzt", "Beispielweg 1", 2024,6,1);
        Termin t2 = new Termin("Fussball", "Stadion", 2024,5,5);
        Termin t3 = new Termin("Einkaufen", "Edeka", 2024,7,2);
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        c1.set(2024,6,1);
//        c2.set(2024,5,5);
//        System.out.println(c2.compareTo(c1));

        Termin[] terminArray = {t1,t2,t3};
        Arrays.sort(terminArray, (a,b) -> a.getZeit().compareTo(b.getZeit()));
        Calendar testCalender = Calendar.getInstance();
        testCalender.set(2024,6,6);
        printTermine(terminArray, termin -> termin.getZeit().after(testCalender));
    }

    public static void printTermine(Termin[] terminArray, Predicate<Termin> kriterium ){
        for(Termin t : terminArray){
            if(kriterium.test(t)){
                System.out.println(t);
            }
        }
    }
}
