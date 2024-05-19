package Aufgaben_05;

import java.util.Arrays;

public class IntegerStack {
    private int[] arr;

    private int pointer = 0;

    public IntegerStack(int laenge){
        arr = new int[laenge];
    }

    public void push(int value){
        if(pointer < arr.length-1) {

            arr[pointer] = value;
            pointer++;


        }else {
            arr[pointer] = value;
        }
    }
    public int pop(){
        if(0 < pointer) {
            int temp = arr[pointer];
            arr[pointer]=0;
            pointer--;
            return temp;

        }
        return arr[0];
    }

    public String toString(){
        return Arrays.toString(arr);
    }
}
