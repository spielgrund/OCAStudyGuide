package Aufgaben_06;

public class Box <T> implements Markierbar <T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public void setMarke(T m) {

    }

    @Override
    public T getMarke() {
        return null;
    }
}
