package Chapter_04;

interface MyInterface {
    void myMethod(String s);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression implementing the single abstract method of MyInterface
        MyInterface myLambda = (String s) -> System.out.println("Hello, " + s);

        // Calling the method using the lambda expression
        myLambda.myMethod("World");
    }
}