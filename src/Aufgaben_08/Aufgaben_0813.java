package Aufgaben_08;

//Dateien können bytweise und blockweise (int read(byte[b] b)) gelesen und geschrieben
//(void write(byte[] b) werden. Schreiben Sie zwei Programme, die eine große Datei
//byteweise bzw. blockweise kopieren und ermitteln Sie dabei die Laufzeit in Millisekunden
//sowie den Durchsatz in Bytes/Sek. Testen Sie auch verschiedene Arraygrößen.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Aufgaben_0813 {

    public static void main(String[] args) {
        String dateiname = "byteweise.txt";
        long startTime = System.currentTimeMillis();

        try (FileInputStream inputStream = new FileInputStream("weather_stations.csv");
                FileOutputStream outputStream = new FileOutputStream(dateiname)) {

            // Beispielinhalt: Einfache Zeichen als Bytes schreiben
            //String inhalt = "Hallo Welt!";

            int data;
            // Read and print each byte of the file
            while ((data = inputStream.read()) != -1) {
                //System.out.print((byte) data);
                outputStream.write(data);
            }

            System.out.println("Datei byteweise geschrieben.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Bytewise execution took " + duration + " milliseconds.");

        /////////////////////////////////////////////////////////////////////////////////

        String dateiname2 = "blockweise.txt";
        long startTime2 = System.currentTimeMillis();

        try (FileInputStream inputStream2 = new FileInputStream("weather_stations2.csv");
             FileOutputStream outputStream2 = new FileOutputStream(dateiname2)) {
            byte[] block = new byte[1024]; // Blockgröße von 1024 Bytes
            int bytesRead;
            while ((bytesRead = inputStream2.read(block)) != -1) {
                outputStream2.write(block, 0, bytesRead);
            }
            System.out.println("\nDatei blockweise gelesen.");
            long endTime2 = System.currentTimeMillis();
            long duration2 = endTime2-startTime2;
            System.out.println("Blockwise execution took " + duration2 + " milliseconds.");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
