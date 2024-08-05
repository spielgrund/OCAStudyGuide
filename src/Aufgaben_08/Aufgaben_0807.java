package Aufgaben_08;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class Aufgaben_0807 {

}
class Kompression{
    public static void main(String[] args) throws IOException {
        try(PushbackInputStream in = new PushbackInputStream(
                new FileInputStream("daten.txt"));
            BufferedOutputStream out = new BufferedOutputStream(
                    new FileOutputStream("daten_komprimiert.txt"))){

            int z, b, next;
            while((b = in.read()) != -1){
               //zählt die Anzahl gleicher Bytes b
               for (z = 1; (next = in.read()) != -1; z++){
                   if (b != next || z == 255)
                       break;
               }

               // Komprimierung nur bei mindestens 4 gleichen Bytes
                if (z > 3) {
                    out.write('@');
                    out.write(b);
                    out.write(z);
                } else {
                    for (int i = 0; i < z; i++)
                        out.write(b);
                }

                // letztes Byte next wird zurückgestellt,
                // da b != next bzw. z == 255
                if (next != -1)
                    in.unread(next);
            }
        }
    }
}

class Decompression{
    public static void main(String[] args) throws IOException, FileNotFoundException {
        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("daten_komprimiert.txt"));
             BufferedOutputStream out = new BufferedOutputStream(
                     new FileOutputStream("daten_entkomprimiert.txt"))) {

            int b, x, z;
            while ((b = in.read()) != -1) {
                if (b == '@') {
                    x = in.read();
                    z = in.read();
                    for (int i = 0; i < z; ++i)
                        out.write(x);
                        System.out.print((char) x);
                } else
                    out.write(b);
                    System.out.println((char) b);
            }
            out.close();
            try (BufferedReader br = new BufferedReader(new FileReader("daten_entkomprimiert.txt")))
            {
                String line;
                while ((line = br.readLine()) != null) {

                    System.out.println(line);  // Print each line to the console
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

}