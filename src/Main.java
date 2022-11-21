import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<Person> comparator = (p1, p2)  -> {
            int wordsLimitInSurname = 2;
            if ((p1.surnameSplit() <= wordsLimitInSurname) && (p2.surnameSplit() <= wordsLimitInSurname)) {
                if (p1.surnameSplit() > p2.surnameSplit()) {
                    return 1;
                } else if (p1.surnameSplit() < p2.surnameSplit()) {
                    return -1;
                } else {
                    return Integer.compare(p1.getAge(), p2.getAge());
                }
            }
            else {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}