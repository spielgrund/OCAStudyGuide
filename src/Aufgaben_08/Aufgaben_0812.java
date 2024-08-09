package Aufgaben_08;

//Schreiben Sie ein Propgramm, das den Inhalt einer Datei im Hexadezimalcode ausgibt.
// Jeweils 16 Bytes sollen in einer Zeile ausgegeben werden: links im Hexadezimalcode,
// rechts als lesbare Zeichen (nicht druckbare Zeichen sind durch einen Punkt zu ersetzen).

import java.io.*;

public class Aufgaben_0812 {
    public static void main(String[] args) throws IOException {



        // Create an InputStream
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("text.txt"))) {
            {
                int input;

                int i = 0;
                char[] ch = new char[16];

                // Read and print each byte of the file
                while ((input = bufferedInputStream.read()) != -1) {
                    if (input > 31 && input < 127)
                        ch[i] = (char) input;
                    else
                        ch[i] = '.';


                    String hex = Integer.toHexString(input);
                    hex = hex.length() == 1 ? "0" + hex : hex;
                    System.out.print(hex + " ");


                    i++;
                    // nach 16 gelesenen Zeichen
                    if (i == 16) {
                        System.out.print(" ");
                        for (int j = 0; j < 16; j++)
                            System.out.print(ch[j]);
                        System.out.println();
                        i = 0;
                    }
                }
                // Rest ausgeben
                if (i != 0) {
                    for (int j = 0; j < 16 - i; j++)
                        System.out.print("   ");
                    System.out.print(" ");
                    for (int j = 0; j < i; j++)
                        System.out.print(ch[j]);
                    System.out.println();
                }
            }
        }
    }
}

