package Aufgaben_08;

import java.io.IOException;

public class Aufgaben_0818 {
    public static void main(String[] args) throws IOException {
        Ram.WriteToRam(100.);
        Ram.WriteToRam(333.33);
        Ram.WriteToRam(666.66);
        Ram.ReadFromRam(3);
    }
}
