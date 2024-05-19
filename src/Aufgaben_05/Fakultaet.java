package Aufgaben_05;

import java.math.BigInteger;

public class Fakultaet {
    public BigInteger fakultaet(int i){
        BigInteger bigint = BigInteger.valueOf(1);
        for (int j = 1; j <= i; j++) {

            bigint = bigint.multiply(BigInteger.valueOf(j));

        }
        return bigint;
    }

    public static void main(String[] args) {
        Fakultaet f = new Fakultaet();
        System.out.println(f.fakultaet(39));
    }
}
