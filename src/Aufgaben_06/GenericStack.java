package Aufgaben_06;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericStack<T> {
    ArrayList<T> stack = new ArrayList<T>();

    public boolean empty(){return stack.isEmpty();}
    public T push(T item){
        stack.add(item);
        return item;
    }
    public T pop(){
        if(!empty()){
            T temp = stack.getLast();
            stack.removeLast();
            return temp;
        }
        return null;
    }

    public T peek(){
        if(!empty()){
            return stack.getLast();
        }
        return null;}

    @Override
    public String toString() {
        return stack.toString();
    }
}
