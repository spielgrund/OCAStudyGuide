package Chapter_02;

public class Aufgabe_02_04 {
    public static int flaschenInKarton(int x, int n){
        if(x % n != 0){
            return x / n + 1;
        }
        else{
        return x / n;
        }
    }
    public static void main(String[] args) {
        System.out.println(flaschenInKarton(20, 6));
        System.out.println(flaschenInKarton(20, 5));
    }
}
