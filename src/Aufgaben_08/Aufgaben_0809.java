package Aufgaben_08;

import java.io.*;

public class Aufgaben_0809 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(
                new FileReader("umsatz.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("liste.txt"),
                     true)){
             System.out.println("Umsatzliste");
            System.out.println("============");
            String line;
            double d = 0.0;
            double sum = 0.0;
            while ((line = in.readLine()) != null) {
                try{
                    d = Double.parseDouble(line);
                    System.out.printf("€ %.2f%n", d);
                    sum += d;
                }
                catch(NumberFormatException n){
                    // System.out.println(n);
                }
            }
            System.out.println("------------------");
            System.out.printf("€ %.2f%n", sum);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
