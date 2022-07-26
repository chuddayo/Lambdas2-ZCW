package lambdas;

import java.util.function.Predicate;

public class PredicateExample implements CheckPerson {
    Predicate<Integer> ageOver20 = x -> x > 20;

    @Override
    public boolean test(Person p) {
        return ageOver20.test(p.getAge());
    }
}
