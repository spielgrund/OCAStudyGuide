package Aufgaben_06;

public class DruckerwarteschlangeTest {
    public static void main(String[] args) {
        Druckerwarteschlange druckerwarteschlange = new Druckerwarteschlange();
        Dokument d1 = new Dokument("Dokument 1", 5);
        Dokument d2 = new Dokument("Dokument 2", 2);
        Dokument d3 = new Dokument("Dokument 3", 3);
        druckerwarteschlange.add(d1);
        druckerwarteschlange.add(d2);
        druckerwarteschlange.add(d3);
        System.out.println(druckerwarteschlange);
        druckerwarteschlange.process();
        druckerwarteschlange.process();
        druckerwarteschlange.process();
        System.out.println(druckerwarteschlange);

    }
}
