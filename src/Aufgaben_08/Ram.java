package Aufgaben_08;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ram {
    public static void WriteToRam(Double d) throws IOException {
        double value = d;

        try (RandomAccessFile f = new RandomAccessFile("messwerte.dat", "rw")) {

            long length = f.length();
            f.seek(length);

            long time = System.currentTimeMillis();
            f.writeLong(time);
            f.writeDouble(value);
        }
    }

    public static void ReadFromRam(int i) throws IOException {
        int count = i;

        try (RandomAccessFile f = new RandomAccessFile("messwerte.dat", "r")) {
            long pos = Math.max(f.length() - 16 * count, 0);
            f.seek(pos);

            long time;
            double value;
            SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            while (true) {
                time = f.readLong();
                value = f.readDouble();
                Date d = new Date(time);
                System.out.println(s.format(d) + " -> " + value);
            }
        } catch (EOFException e) {
        }
    }
}
