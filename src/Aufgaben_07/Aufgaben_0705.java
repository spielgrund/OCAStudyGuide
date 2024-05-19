package Aufgaben_07;

import java.util.Arrays;
import java.util.List;

public class Aufgaben_0705 {
    public static void main(String[] args) {
        Person p1 = new Person("Bernd", "Bummel");
        Person p2 = new Person("Alfred", "Albern");
        Person p3 = new Person("Dirk", "Durstig");
        Person p4 = new Person("Clara", "Sprudel");
        List<Person> personList = List.of(p1,p2,p3,p4);
        Object[] namen = personList.stream().map(p -> p.getVorname().toUpperCase() + " " + p.getNachname().toUpperCase())
                .sorted().toArray();
        System.out.println(Arrays.toString(namen));
    }
}
