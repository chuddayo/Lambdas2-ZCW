package lambdas;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }
    String name;
    LocalDate birthday;
    Sex sex;
    String emailAddress;
    Integer age;

    public Person() {}
    public Person(String name, LocalDate birthday, Sex sex, String emailAddress, Integer age) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void printPerson(Person p) {
        System.out.println(p.getName() + " is " + p.getAge());
    }
}
