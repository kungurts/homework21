public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName() {
        this.name = name;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public void setAge() {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int surnameSplit() {
        String[] surnameParts = surname.split("\\P{IsAlphabetic}+");
        return surnameParts.length;
    }

    @Override
    public String toString() {
        return "{" + name + " " + surname + ": " + age + "}";
    }
}
