package Aufgaben_05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Isabelle {
    static LocalDate isabellsGeburtstag = LocalDate.of(2006,12,28);

    public static void WieLangeNoch(){
        long dauer = ChronoUnit.DAYS.between(isabellsGeburtstag, LocalDate.now());

        System.out.println("Es sind " + dauer + " Tage seit Isabelles Geburtstag vergangen.");

        LocalDate geburtstagsFix = LocalDate.of(LocalDate.now().getYear(),isabellsGeburtstag.getMonth(),isabellsGeburtstag.getDayOfMonth());
        System.out.println(geburtstagsFix);
        if(geburtstagsFix.isBefore(LocalDate.now())){
            geburtstagsFix.plusYears(1);
        }
        long dauer2 = ChronoUnit.DAYS.between(LocalDate.now(), geburtstagsFix);


        System.out.println("Es sind noch " + dauer2 + " Tage bis zu ihrem nächsten Geburtstag!");
    }

    public static void main(String[] args) {
        WieLangeNoch();
    }
}
