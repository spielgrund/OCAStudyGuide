package Aufgaben_08;

//Schreiben Sie ein Programm, dass eine Datei nach einem Wort durchsucht und alle Zeilen in denen das Wort
//gefunden wird, mit Zeilennummer ausgibt


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aufgaben_0804 {
    public static void main(String[] args) throws IOException {
        String filePath = "src/BeispielText.txt";
        final String STRINGTOMATCH = "das";
        findWord(filePath, STRINGTOMATCH);
    }
    public static void findWord(String filePath, String stringToMatch) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            count++;
            if(line.contains(stringToMatch)){
                System.out.println(count + " " + line);
            }
        }
    }
}
