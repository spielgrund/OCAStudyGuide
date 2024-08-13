package Vererbung;

public class B extends A{
String str = "B";
public void print(){
    System.out.println(str);
}

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();
        B bc = new C();
        A ac = new C();
        //intD intd = new C();
//        a.print();
//        b.print();
//        ab.print();
//        bc.print();
        ((C) ac).print();

    }
}
