package Aufgaben_06;

import java.util.Enumeration;
import java.util.Vector;

public class Aufgabe0607 {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();
        stringVector.add("Eins");
        stringVector.add("Zwei");
        stringVector.add("Drei");

        Enumeration<String> eString = stringVector.elements();
        while(eString.hasMoreElements()){
            System.out.println(eString.nextElement());
        }
    }
}
