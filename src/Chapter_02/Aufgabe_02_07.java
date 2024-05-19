package Chapter_02;

import java.time.LocalTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class Aufgabe_02_07 {
    public static int sekundenImMonat(int jahr, int monat){
        try{
            int tageImMonat = YearMonth.of(jahr, monat).lengthOfMonth();
            int sekundenImMonat = tageImMonat*24*60*60;
            return sekundenImMonat;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sekundenImMonat(2024,02));
        System.out.println(sekundenImMonat(2024,0));
    }
}
