package Aufgaben_08;

import java.io.*;

public class Aufgaben_0802 {
    public static void main(String[] args) {
        // Pfad zur Textdatei
        String filePath = "src/BeispielText.txt";
        final int MAXCHARS = 10;

        // Datei einlesen und Wörter ausgeben
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;
            byte[] b = new byte[8];

            while ((line = br.readLine()) != null) {
                count++;
                if(count==MAXCHARS){
                    count=0;
                    System.out.print("-- Weiter mit RETURN --");
                    System.in.read(b);
                }
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}