package Aufgaben_08;

import java.io.*;

class GrossZuKleinFilterReader extends FilterReader {

    protected GrossZuKleinFilterReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int i = super.read();
        if (i == -1) {
            return -1;
        }
        return Character.toUpperCase(i);
    }
}

public class Aufgaben_0810 {

    public static void main(String[] args) {
        try (Reader fileReader = new FileReader("daten.txt");
             FilterReader filterReader = new GrossZuKleinFilterReader(fileReader)) {

            int c;
            while ((c = filterReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
