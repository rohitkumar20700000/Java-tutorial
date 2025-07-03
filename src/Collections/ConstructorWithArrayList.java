package Collections;

import java.util.ArrayList;
import java.util.List;

public class ConstructorWithArrayList {
    private final List<Person> people = new ArrayList<>();

    private static class Person {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public void addPerson(String name, int age) {
        if (name == null || name.isBlank()) {
            return;
        }
        people.add(new Person(name, age));
    }

    public void displayPeople() {
        for (Person p : people) {
            System.out.println("Name: " + p.name + ", Age: " + p.age);
        }
        System.out.println(people);   
        }

    public static void main(String[] args) {
        ConstructorWithArrayList obj = new ConstructorWithArrayList();
        obj.addPerson("Kuna", 20);
        obj.addPerson("Sha", 21);
        obj.displayPeople(); // ✅ No invisible characters after this line
    }
}
