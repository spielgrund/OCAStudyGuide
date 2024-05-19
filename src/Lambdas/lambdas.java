package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;





    public class lambdas {
        public static void main(String[] args) {

            // Finale Variablen: Finale Variablen mit dem 'final' Schlüsselwort
            // final int i = 10;

            // Effectively Final Variable: Variablen denen wir einmal und dann nie wieder etwas zuweisen

            String s = "blabla";
            // s = "bla"; - Diese Zuweisung würde den effectively final-Status von der Variable nehmen
            // In Lambdas können wir auf Variablen von Außerhalb zugreifen - solange diese Final oder Effektivley Final sind
            Predicate<String> pred = x -> s.length() > 10;



            // Lambda
            // (Parameter) -> {Methodendefinition};
            // Haben wir nur einen Parameter, können die Parameterklammern weggelassen werden.
            // Haben wir ABER keinen oder mehr als einen Parameter, müssen die Klammern auf jeden Fall dazu!
            // Die Datentypen vor den Variablen sind Optional
            // werden die Datentypen jedoch mitgegeben, sind die Klammern wieder pflicht

            // Wenn die Anweisung im Lambda einzeilig ist, kann man die Klammern weglassen
            // Fehlen die geschweiften Klammern, ist das return schon implizit mit dabei.

            // Lambdas erzeugen keinen neuen Scope, so müssen wir aufpassen, dass die Variablenbezeichner, die wie für die Parameter nutzen,
            // nicht bereits existieren

            myInterface mi2 = (int x)-> x > 100;
            myInterface mi = x-> x > 100;
            myInterface2 add = (a,b)-> a+b;;;;;;
            myInterface2 multi = (int a, int b)->{return b;};

            multi.operation(2,3);// 2*3
            add.operation(5,5); // 5+5


            System.out.println(Math.random()); // Methodenaufruf

            tuwas(7);
            tuwas((i)->i>10); // Methodenübergabe
        }


        public static void tuwas(myInterface mi) {
            // code
            mi.test(7);
        }
        public static void tuwas(int i) {
            System.out.println(i);
        }
    }



    // Funktionales Interface (Nur 1 abstrakte Methode)
    interface myInterface {
        boolean test(int i);
    }

    interface myInterface2 {
        int operation(int i, int j);

    }


    interface I {

        // Attribute sind in Interfaces 'public static final';
        public final static int X = 5;

        void tuwas(); // public abstract

        void tuwas2(); // public abstract
    }

