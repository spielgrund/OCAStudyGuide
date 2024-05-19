package Aufgaben_06;

public class Test {
    public static void print(Paar<?,?> p){
        System.out.println("(" + p.getValue1() + "," + p.getValue2() + ")");
    }
    public static double add(Paar<? extends Number,? extends Number> paar){
        return paar.getValue1().doubleValue()+paar.getValue2().doubleValue();
    }

    public static double add2(Paar<Number,Number> paar){
        return paar.getValue1().doubleValue()+paar.getValue2().doubleValue();
    }
    public static void main(String[] args) {
        ZahlenPaar zahlenPaar = new ZahlenPaar();
        zahlenPaar.setValue1(1);
        zahlenPaar.setValue2(2);
        System.out.println(zahlenPaar.sum());
        zahlenPaar.print();
        print(zahlenPaar);
        Paar<Number,Number> paar = new Paar<>();
        paar.setValue1(5);
        paar.setValue2(10.0);
        System.out.println(add(paar));
    }
}
