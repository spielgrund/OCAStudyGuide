package Aufgaben_08;

import java.io.IOException;

public class Aufgaben_0803{
    public static void main(String[] args) throws IOException{
        System.out.println("Hello!");
        byte[] buffer = new byte[1024]; // Buffer to hold input data
        int bytesRead;
        int characters = 0;
        int newlines = 0;


            // Read data from System.in (which will be redirected to read from a file)
            //while ((bytesRead = System.in.read(buffer)) != -1) {
        while ((bytesRead = System.in.read()) != -1) {
                //String input = new String(buffer, 0, bytesRead); // Convert bytes to string
                //System.out.print(input); // Print the input
                //characters += input.length();
                //newlines += input.split("\n").length;
            characters++;
            if(bytesRead=='\n'){
                newlines++;
            }
            }
            System.out.printf("Die Datei hatte %d Zeichen und %d Zeilen", characters, newlines);

    }
}
