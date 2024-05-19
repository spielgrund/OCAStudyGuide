package Aufgaben_06;

public class StackTest {
    public static void main(String[] args) {
        GenericStack gs = new GenericStack();
        Konto k1 = new Konto(1234);
        Konto k2 = new Konto(2345);
        Konto k3 = new Konto(3456);
        gs.push(k1);
        gs.push(k2);
        gs.push(k3);
        System.out.println(gs);
        System.out.println(gs.peek());
        System.out.println(gs.pop());
        System.out.println(gs);

    }
}
