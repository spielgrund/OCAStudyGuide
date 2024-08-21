package Aufgaben_08;

//Schreiben Sie ein Programm, das eine Textdatei, die in einem bestimmten Zeichensatz codiert ist,
// in eine Textdatei mit einem anderen Zeichensatz konvertiert.
// Das Programm soll mit den folgenden Programmparametern aufgerufen werden können:
//ein.txt aus.txt IDO-8859-1 UTF-8

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Aufgaben_0822 {

    public static void txtConverter(String input, String output, String inputFormat, String outputFormat)
            throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(input);
        FileOutputStream fileOutputStream = new FileOutputStream(output);
        try{
            int data;

            byte[] block = new byte[1024]; // Blockgröße von 1024 Bytes
            int bytesRead;
            while ((bytesRead = fileInputStream.read(block)) != -1) {
                fileOutputStream.write(block, 0, bytesRead);
            }

            fileInputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) throws FileNotFoundException {
        txtConverter("0822_input.txt","0822_output.txt", "", "");
    }
}
