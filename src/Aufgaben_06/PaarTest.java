package Aufgaben_06;

public class PaarTest {
    public static void main(String[] args) {
        Paar<String,Integer> paar = new Paar<>();
        paar.setValue1("test");
        paar.setValue2(5);
        System.out.println(paar.getValue1() + " " + paar.getValue2());
    }
}
