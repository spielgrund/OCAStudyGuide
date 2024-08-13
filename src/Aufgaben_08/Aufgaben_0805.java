package Aufgaben_08;

//Wie kann eine instanz der Klasse Printwriter genutzt werden, um Daten am Bildschirm auszugeben.

import java.io.*;

public class Aufgaben_0805 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/BeispielText.txt");
        try (
                BufferedReader br = new BufferedReader(new FileReader(file));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out))
        ) {
            String line;
            while ((line = br.readLine()) != null) {

                pw.println(line);  // Print each line to the console
            }
            pw.flush();  // Ensure all data is written to the console
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
