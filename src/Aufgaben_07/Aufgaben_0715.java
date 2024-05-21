package Aufgaben_07;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aufgaben_0715 {
    public static void main(String[] args) {
        Person p1 = new Person("Peter", "Peterson", "München");
        Person p2 = new Person("Dieter", "Dieterson", "Dortmund");
        Person p3 = new Person("Hans", "Hanson", "München");
        Person p4 = new Person("Franz", "Franzson", "Dortmund");

        List<Person> persons = List.of(p1,p2,p3,p4);

        Map<String, List<Person>> grouped = persons.stream().collect(Collectors.groupingBy(Person::getWohnort));
        System.out.println(grouped);
        for(String s : grouped.keySet()){
            System.out.println(s + ": " + grouped.get(s).size());
        }
        System.out.println();
        for(String s : grouped.keySet()){
            System.out.println(s + ": ");
            grouped.get(s).stream().map(Person::getVorname).forEach(System.out::println);
            System.out.println();
        }
    }
}
