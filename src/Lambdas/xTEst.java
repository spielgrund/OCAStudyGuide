package Lambdas;

public class xTEst {
    public static void main(String[] args) {
        MyAdd myadd = (i,j) -> i + j;
        System.out.println(2 == myadd.add(1, 1));
    }
}
