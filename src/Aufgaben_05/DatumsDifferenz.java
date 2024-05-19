package Aufgaben_05;

import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;

public class DatumsDifferenz {
    public static int getDaysBetween(int startYear, int startMonth,int startDay,
                                     int endYear, int endMonth, int endDay){
        GregorianCalendar gregStart = new GregorianCalendar(startYear, startMonth, startDay);
        GregorianCalendar gregEnd = new GregorianCalendar(endYear, endMonth, endDay);
        int i = 0;

        while(gregStart.before(gregEnd)){
            i++;
            gregStart.add(5, 1);

        }
        return i-1;
    }

    public static void main(String[] args) {
        System.out.println(getDaysBetween(2000,1,1,2001,1,1));
    }
}
