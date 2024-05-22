package Aufgaben_08;

import java.io.*;

public class Aufgaben_0802 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Aufgabe_0802.txt");
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String line;
            int count = 0;
            byte[] b = new byte[8];
            while((line = in.readLine()) != null){
                System.out.println(line);
                count++;
                if(count==2){
                    System.out.print("-- Weiter mit RETURN --");
                    System.in.read(b);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
