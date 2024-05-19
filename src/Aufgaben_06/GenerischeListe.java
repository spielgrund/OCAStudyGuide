package Aufgaben_06;

import java.util.Arrays;

public class GenerischeListe<T> {
    private T[] arr;

    public GenerischeListe(int lenght){
        arr = (T[]) new Object[lenght];
    }
    public int size(){
        return arr.length;
    }
    void add(T t){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                arr[i]=t;
                break;
            }
        }
    }
    public T get(int i){
        return arr[i];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        GenerischeListe<Konto> kontoGenerischeListe = new GenerischeListe<>(3);
        Konto k1 = new Konto(123);
        Konto k2 = new Konto(234);
        Konto k3 = new Konto(345);
        kontoGenerischeListe.add(k1);
        kontoGenerischeListe.add(k2);
        kontoGenerischeListe.add(k3);
        System.out.println(kontoGenerischeListe);


    }

}
