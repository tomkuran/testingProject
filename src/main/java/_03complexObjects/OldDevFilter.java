package _03complexObjects;

import java.util.Collection;
import java.util.stream.Collectors;

public class OldDevFilter {

    public Collection<Person> filter(Collection<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() >= 30)
                .filter(person -> person.getJob() == Job.JAVA_DEV)
                .collect(Collectors.toList());
    }
}
