package Oleh.Shevchenko;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            List<Person> personList = Collections.singletonList(PersonFactory.createPerson());
            Set<Person> set = new HashSet<>(personList);
            System.out.println(set);
        }
    }
}