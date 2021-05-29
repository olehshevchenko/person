package Oleh.Shevchenko;

import java.util.Random;

public class PersonFactory {
    private static final String [] FIRST_NAMES = {"Oleh", "Andrey", "Alex", "Roman", "Tanya", "Anastasiya"};
    private static final String [] LAST_NAMES = {"Brown", "Jones", "Franko", "Miller", "Cobain", "Smith"};
    private static final Random RANDOM = new Random();

    public static Person createPerson () {
        String name = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
        String surname = LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];
        int age = RANDOM.nextInt(100);
        int weight;
        int height;

        if (age < 5) {
            weight = RANDOM.nextInt(7) + 3;
            height = RANDOM.nextInt(30) + 70;
        }
        else if (age > 5 && age < 12) {
            weight = RANDOM.nextInt(40) + 10;
            height = RANDOM.nextInt(100) + 50;
        }
        else if (age >= 12 && age < 18) {
            weight = RANDOM.nextInt(50) + 30;
            height = RANDOM.nextInt(150) + 50;
        }
        else {
            weight = RANDOM.nextInt(60) + 50;
            height = RANDOM.nextInt(150) + 50;
        }

        return new Person(name, surname, age, weight, height);
    }
}


