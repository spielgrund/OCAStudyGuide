package Aufgaben_07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Aufgabe_0709 {
    public static void main(String[] args) {
        Person p1 = new Person("Max","Maxson",1990,05,29);
        Person p2 = new Person("Peter", "Peterson", 1960, 05, 15);
        Person p3 = new Person("Annie", "Anniesdottir", 1962, 02, 10);

        List<Person> personArray = new ArrayList<>();
        personArray.addAll(Arrays.asList(p1,p2,p3));
        System.out.println(personArray);
        System.out.println();
        BinaryOperator<String> combiner = (s1, s2) -> {
            if (s1.length() == 0)
                return s2;
            else
                return s1 + ", " + s2;
        };
        String string = personArray.stream().filter(a -> a.getGeburtstag().getMonthValue()==5).map(s -> s.getVorname())
                .reduce("", combiner);
        System.out.println(string);

    }
}
