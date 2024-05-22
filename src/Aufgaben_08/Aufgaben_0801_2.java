package Aufgaben_08;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Aufgaben_0801_2 {
    public static void main(String[] args) throws IOException {
        File f = new File(".");
        zeigeDateienRec(f);
    }
    public static void zeigeDateienRec(File file) throws IOException {
        File[] files = file.listFiles();

        for(File f: files){
            System.out.println(f.getCanonicalPath());
            if(f.isDirectory()){
                zeigeDateienRec(f);
            }
        }
    }
}
