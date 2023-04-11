package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest {
    public static class Person {
        String firstName;
        String lastName;

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String toString() { return firstName + " " + lastName; }

        public String getFirstName() { return firstName; }
    };

    public void printPersonsJava7(List<Person> list) {
        System.out.println("-- Java 7 --");
        Collections.sort(list, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
        });

        for (Person person : list) {
            System.out.println(person);
        }
    }

    public void printPersonsJava8(List<Person> list) {
        System.out.println("-- Java 8 --");
        Collections.sort(list, (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        PersonTest test = new PersonTest();
        Person[] people = {new Person("Tom", "Blayr"),
                           new Person("Hun", "Yang"),
                           new Person("Mickail", "Jackson")};
        List<Person> list = Arrays.asList(people);
        test.printPersonsJava7(new ArrayList<>(list));
        test.printPersonsJava8(new ArrayList<>(list));
    }
}
