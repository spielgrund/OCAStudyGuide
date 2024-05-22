package Aufgaben_08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Aufgaben_0803 {
    public static void main(String[] args) throws IOException {
        String filePath = "Aufgabe_0802.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(filePath))){
            int zeichen = 0;
            int zeilen = 0;
            String line;
            while((line = in.readLine()) != null){
                System.out.println(line);
                zeichen += line.length();
                zeilen++;
            }
            System.out.println();
            System.out.println(String.format("Das waren %d Zeichen und %d Zeilen", zeichen,zeilen));
        }

    }
}
