package Aufgaben_08;

import java.io.*;
import java.time.LocalDate;

public class Aufgaben_0815 {

    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter();
        m1.setPersid(1);
        m1.setName("Herr Peters");
        m1.setGeburtsDatum(LocalDate.of(1980,01,01));
        m1.setAdresse(new Adresse("Hauptstrasse 1", "58119", "Bahnhofshausen"));
        m1.setKontakte(new Mail("test@test.de"));
        m1.setKontakte(new Telefon("0231202020"));

        System.out.println(m1);

        Mitarbeiter m2 = new Mitarbeiter();
        m2.setPersid(2);
        m2.setName("Herr Walters");
        m2.setGeburtsDatum(LocalDate.of(1981,02,02));
        m2.setAdresse(new Adresse("Hauptstrasse 2", "58119", "Bahnhofshausen"));
        m2.setKontakte(new Mail("walter@test.de"));
        m2.setKontakte(new Telefon("0231303030"));

        System.out.println(m2);

        Mitarbeiter m3 = new Mitarbeiter();
        m3.setPersid(3);
        m3.setName("Herr Honks");
        m3.setGeburtsDatum(LocalDate.of(1983,03,03));
        m3.setAdresse(new Adresse("Hauptstrasse 3", "58119", "Bahnhofshausen"));
        m3.setKontakte(new Mail("honk@test.de"));
        m3.setKontakte(new Telefon("0231404040"));
        System.out.println(m3);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("mitarbeiter.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(m1);
            objectOutputStream.writeObject(m2);
            objectOutputStream.writeObject(m3);

            objectOutputStream.close();
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("mitarbeiter.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            m3 = (Mitarbeiter) objectInputStream.readObject();
            m2 = (Mitarbeiter) objectInputStream.readObject();
            m1 = (Mitarbeiter) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(m3);
        System.out.println(m2);
        System.out.println(m1);
    }
}
