import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", "Kusto", 18));
        people.add(new Person("Oleg", "Mamin-Sibiryak", 39));
        people.add(new Person("Petr", "Petrov-Vodkin", 31));
        people.add(new Person("Alex", "Picasso", 35));
        people.add(new Person("Kim", "Al Yo Pachino", 14));
        people.add(new Person("Jack", "Do Shi Rak", 18));

        System.out.println(people);

        Collections.sort(people, new SurnameComporator());
        System.out.println(people);
    }
}