package Aufgaben_08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Aufgaben_0801 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get(".");
        try(Stream<Path> stream = Files.walk(dir)){
            stream.forEach(System.out::println);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
