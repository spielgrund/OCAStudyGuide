package Chapter_02;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Aufgabe_02_06 {
    public static LocalTime addiereStunden(LocalTime jetzt, int stunden){
        return jetzt.plusHours(stunden).truncatedTo(ChronoUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(addiereStunden(LocalTime.now(), 10));
        System.out.println(addiereStunden(LocalTime.of(20,00),5));
    }
}
