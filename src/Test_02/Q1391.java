package Test_02;

public class Q1391 {
    private int j;

    void showJ() {
        while (j <= 5) {
            for (int j = 1; j <= 5; ) {//Shadowing von j
                System.out.print(j + " ");
                j++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        new Q1391().showJ();
    }
}
