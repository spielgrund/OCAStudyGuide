package Aufgaben_05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AktuellesDatum {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE', den 'dd.MM.yyyy.");

    LocalDateTime ldt2014 = LocalDateTime.of(2014,01,01, 00,00,00);

    public String seit(){
        Duration duration = Duration.between(ldt2014,LocalDateTime.now());
        String durationFormat = String.format("%d Tage %d Stunden %d Minuten %d Sekunden",
                duration.toDaysPart(), duration.toHoursPart(), duration.toMinutesPart(), duration.toSecondsPart());
        return durationFormat;
    }


    @Override
    public String toString() {

        return LocalDate.now().format(dtf).toString();
    }
}
