package Aufgaben_08;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Aufgaben_0819 {

    public static void main(String[] args) {

            // Create an object to encode
            McGuffin mcGuffin = new McGuffin(5);

        try (FileOutputStream fos = new FileOutputStream("mcguffin.xml");
             XMLEncoder encoder = new XMLEncoder(fos)) {

            // Encode the object to XML
            encoder.writeObject(mcGuffin);
            System.out.println("Object successfully encoded to mcguffin.xml");

        } catch (IOException e) {
            e.printStackTrace();
        }
        mcGuffin.setId(0);
        System.out.println(mcGuffin);

        try (FileInputStream fis = new FileInputStream("mcguffin.xml");
             XMLDecoder decoder = new XMLDecoder(fis)) {

            mcGuffin = (McGuffin) decoder.readObject();
            System.out.println("Object successfully decoded");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(mcGuffin);


    }
}
