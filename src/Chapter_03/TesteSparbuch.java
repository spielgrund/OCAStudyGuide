package Chapter_03;

public class TesteSparbuch {
    public static void main(String[] args) {
        var sparbuch = new Sparbuch(123456, 28_500, 2.87);
        System.out.println(sparbuch);
        sparbuch.zahleEin(1000);
        sparbuch.hebeAb(500);
        System.out.println(sparbuch);
        System.out.println(sparbuch.getErtrag(3));
        sparbuch.verzinse(5);
        System.out.println(sparbuch);
    }
}
