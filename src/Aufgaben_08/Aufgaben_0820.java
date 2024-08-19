package Aufgaben_08;

import java.io.File;
import java.io.IOException;

public class Aufgaben_0820 {

    static void findAllJavaFiles(String start) throws IOException {
        File file = new File(start);
        File[] files = file.listFiles();

        for(File f: files){
            if(f.toString().endsWith(".java")){
                System.out.println(f.getCanonicalPath());
            }
            if(f.isDirectory()){
                findAllJavaFiles(f.toString());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        findAllJavaFiles("C:\\Users\\timme\\IdeaProjects\\OCAStudyGuide\\src\\Aufgaben_08");
    }
}
