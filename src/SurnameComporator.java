import java.util.Comparator;

public class SurnameComporator implements Comparator<Person> {
    int wordsLimitInSurname;

    public SurnameComporator() {
        this.wordsLimitInSurname = 2;
    }

    @Override
    public int compare(Person p1, Person p2) {
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
    }
}
