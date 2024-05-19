package Aufgaben_05;

import java.io.*;
import java.util.*;

public class MailAdressen {

    private String filename;

    HashMap<String, String> hashmap = new HashMap<>();

    public MailAdressen(String filename){
        this.filename = filename;

    }

    public void hinzufuegen(String name, String email){
        hashmap.put(name, email);
    };
    //public void entfernen(){};

    public void einlesen() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] linesplit = line.split("///");

                hashmap.put(linesplit[0],linesplit[1]);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        public void schreiben(){
        StringBuilder sb = new StringBuilder();
        for(String s: hashmap.keySet()){
            sb.append(s).append("///").append(hashmap.get(s)).append(System.getProperty("line.separator"));
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            writer.write(sb.toString());

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<String> keys = new ArrayList(hashmap.keySet());
        Collections.sort(keys);

        for(String s : keys){
            sb.append(s + " | " + hashmap.get(s)).append("\n");

        }
        return sb.toString();
    }
}
