package Aufgaben_08;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aufgaben_0820 {

    static void findAllJavaFiles(String start, String relativeString) throws IOException {
        File file = new File(start);
        File[] files = file.listFiles();

        for(File f: files){
            if(f.toString().endsWith(".java")){
                Path p = Paths.get(f.getCanonicalPath());
                Path relativePath = Paths.get(relativeString);
                System.out.println(relativePath.relativize(p));
            }
            if(f.isDirectory()){
                findAllJavaFiles(f.toString(),relativeString);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        findAllJavaFiles("C:\\Users\\timme\\IdeaProjects\\OCAStudyGuide\\src\\Aufgaben_08","C:\\Users\\timme\\IdeaProjects\\OCAStudyGuide\\src\\" );
    }
}
