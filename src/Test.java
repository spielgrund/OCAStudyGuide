public class Test {
    int s = 1;
    static void print(){
        System.out.println("Print 1");
    }

    public static void main(String[] args) {
        int s = 2;

        Test test = new Test();
        System.out.println(test.s);
        print();
    }

}
class Second {
    void print(){
        System.out.println("Print 2");
    }
}