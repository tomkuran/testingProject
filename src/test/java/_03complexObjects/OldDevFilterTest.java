package _03complexObjects;

import org.assertj.core.api.Condition;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.util.Sets.newLinkedHashSet;

public class OldDevFilterTest {

    private Condition<Person> old_person = new Condition<>(p -> p.getAge() >= 30, "old person");
    private Condition<Person> java_dev = new Condition<>(p -> p.getJob() == Job.JAVA_DEV, "Java Dev");

    private Person tom = new Person("Tom", 38, Job.JAVA_DEV);
    private Person alice = new Person("Alice", 30, Job.JAVA_DEV);
    private Person bob = new Person("Bob", 29, Job.JAVA_DEV);

    private Person peter = new Person("Peter", 38, Job.NOT_A_DEV);
    private Person james = new Person("James", 30, Job.NOT_A_DEV);
    private Person bill = new Person("Bill", 29, Job.NOT_A_DEV);

    Set<Person> people = newLinkedHashSet(tom, alice, bob, peter, james, bill);

    @Test
    public void shouldFilterOldDevs() {
        // act
        Collection<Person> oldDevs = new OldDevFilter().filter(people);

        // assert
        assertThat(oldDevs).contains(tom, alice);
        assertThat(oldDevs).are(old_person);
        assertThat(oldDevs).are(java_dev);
    }

    @Test
    public void shouldFilterOldDevs2() {
        // act
        Collection<Person> oldDevs = new OldDevFilter().filter(people);

        // assert
        assertThat(oldDevs).areAtLeast(2, allOf(java_dev, old_person));
    }

    @Test
    public void shouldFilterOldDevs3() {
        // act
        Collection<Person> oldDevs = new OldDevFilter().filter(people);

        // assert
        assertThat(oldDevs).doesNotContain(bob);
    }
}