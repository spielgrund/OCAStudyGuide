package Aufgaben_05;

public class IntegerStackTest {
    public static void main(String[] args) {
        IntegerStack is = new IntegerStack(5);
        System.out.println(is);
        is.push(1);
        is.push(2);
        is.push(3);
        is.push(4);
        is.push(5);
        is.push(6);
        System.out.println(is);
        is.pop();
        is.pop();
        is.pop();
        is.pop();
        is.pop();
        is.pop();
        System.out.println(is);
    }
}
