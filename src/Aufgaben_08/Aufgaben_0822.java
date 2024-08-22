package Aufgaben_08;

//Schreiben Sie ein Programm, das eine Textdatei, die in einem bestimmten Zeichensatz codiert ist,
// in eine Textdatei mit einem anderen Zeichensatz konvertiert.
// Das Programm soll mit den folgenden Programmparametern aufgerufen werden können:
//ein.txt aus.txt IDO-8859-1 UTF-8

import java.io.*;
import java.nio.charset.Charset;

public class Aufgaben_0822 {

    public static void txtConverter(String input, String output, String inputFormat, String outputFormat)
            throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(input);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName(inputFormat));
        FileOutputStream fileOutputStream = new FileOutputStream(output);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,Charset.forName(outputFormat));
        try{
            char[] charbuffer = new char[1024];
            int bytesRead;
            while ((bytesRead = inputStreamReader.read(charbuffer)) != -1) {

                outputStreamWriter.write(charbuffer,0,bytesRead);
            }

            inputStreamReader.close();
            outputStreamWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) throws FileNotFoundException {
        txtConverter("0822_input.txt","0822_output.txt", "UTF-8", "ISO-8859-1");
    }
}
