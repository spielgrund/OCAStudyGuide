package Aufgaben_04;

import java.lang.reflect.Array;

public class OOM {
    public static void main(String[] args) {
        String[] oomnoom = new String[2000000000];

        for (int i = 0; i < oomnoom.length ; i++) {
            oomnoom[i] = "langer String für OOM" +
                    "langer String für OOM" +
                    "langer String für OOM" +
                    "langer String für OOM" +
                    "langer String für OOM" +
                    "langer String für OOM" +
                    "langer String für OOM" +
                    "langer String für OOM" +
                    "langer String für OOM";

        }
    }
}
