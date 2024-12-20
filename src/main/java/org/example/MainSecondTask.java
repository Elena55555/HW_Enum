package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainSecondTask {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Melanie", 21, Person.Gender.FEMALE));
        personList.add(new Person("Oliver", 22, Person.Gender.MALE));
        personList.add(new Person("Jack", 34, Person.Gender.MALE));
        personList.add(new Person("Harry", 14, Person.Gender.MALE));
        personList.add(new Person("Jacob", 16, Person.Gender.MALE));
        personList.add(new Person("Florence", 45, Person.Gender.FEMALE));
        personList.add(new Person("Charley", 65, Person.Gender.MALE));
        personList.add(new Person("Thomas", 98, Person.Gender.MALE));
        personList.add(new Person("George", 12, Person.Gender.MALE));
        personList.add(new Person("Agatha", 13, Person.Gender.FEMALE));

        System.out.println("");
        System.out.println("Woman");
        Person.Gender input = Person.Gender.FEMALE;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).gender.equals(input)) {
                System.out.println(personList.get(i));
            }
        }
        System.out.println("");
        System.out.println("Man");
        Person.Gender input2 = Person.Gender.MALE;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).gender.equals(input2)) {
                System.out.println(personList.get(i));
            }
        }
    }
}
