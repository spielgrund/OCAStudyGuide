package Enaira;

import java.io.*;

public class IO {


       public void write(String filename,int i, String string){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            String wdhUndString = i + "///" + string;
            writer.write(wdhUndString);

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        }

//    public void read(String filename){
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            String line;
//            System.out.println("Reading from file:");
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.err.println("Error reading from file: " + e.getMessage());
//        }
//
//    }

    public String[] readToArray(String filename){
        String[] stringArr = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from file:");
            line = reader.readLine();

            int wdh = Integer.parseInt(line.split("///")[0]);
            stringArr = new String[wdh];
            String multiString = line.split("///")[1];
            if(multiString.length()%wdh==0){
                int start = 0;
                int ende = multiString.length()/wdh;
                int laenge = multiString.length()/wdh;
                for (int i = 0; i < wdh; i++) {
                    stringArr[i]= multiString.substring(start,ende);
                    start += laenge;
                    ende += laenge;

                }
            }


        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        return stringArr;
    }

}
