package Aufgaben_06;

import java.util.ArrayList;

public class Druckerwarteschlange {
    private ArrayList<Dokument> warteschlange = new ArrayList<>();

    public void add(Dokument dokument){
        warteschlange.add(dokument);
    }
    public void process(){
        //System.out.println(warteschlange.getFirst());
        //warteschlange.removeFirst();
    }

    @Override
    public String toString() {
        return "Druckerwarteschlange{" +
                "warteschlange=" + warteschlange +
                '}';
    }
}
