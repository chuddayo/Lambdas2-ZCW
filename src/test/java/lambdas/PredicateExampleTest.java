package lambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PredicateExampleTest {
    @Test
    public void predicateExampleCheckPersonTest() {
        PredicateExample newExample = new PredicateExample();
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.setName("Alfred");
        p2.setName("Macy");
        p3.setName("Ron");
        p1.setAge(15);
        p2.setAge(63);
        p3.setAge(55);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        for (Person p : personList) {
            if (newExample.test(p)) {
                Person.printPerson(p);
            }
        }
    }
}
