package katalist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



public class ActionTest {
    private static Action cut;

    @BeforeAll
    static void setUp() {
        cut = new Action();
    }

    @Test
    public void filterListByProperty() {
        List<Person> personList = new ArrayList();

        personList.add(new Person(0, "Ingo", "Müller", 42, Person.Status.ACTIVE.toString()));
        personList.add(new Person(1, "Tapio", "Müller", 9, Person.Status.ACTIVE.toString()));
        personList.add(new Person(2, "Juna", "Müller", 7, Person.Status.ACTIVE.toString()));

        personList.add(new Person(3, "Mio", "Müller", 4, Person.Status.ACTIVE.toString()));
        personList.add(new Person(3, "Mio", "Müller", 4, Person.Status.INACTIVE.toString()));

        personList.add(new Person(3, "Mio", "Müller", 4, Person.Status.ACTIVE.toString()));
        personList.add(new Person(3, "Mio", "Müller", 4, Person.Status.INACTIVE.toString()));

        personList.add(new Person(3, "Mio", "Müller", 4, Person.Status.ACTIVE.toString()));
        personList.add(new Person(3, "Mio", "Müller", 4, Person.Status.INACTIVE.toString()));

        personList.add(new Person(4, "Mio", "Maier", 4, Person.Status.ACTIVE.toString()));

        personList.add(new Person(0, "Ingo", "Müller", 42, Person.Status.INACTIVE.toString()));

        assertTrue(personList.size() == 11);

        List<Person> result = cut.filterListByProperty(personList);
        assertNotNull(result);
        assertEquals(5, result.size());
        assertEquals("Mio", result.get(3).getFirstName());
        assertEquals("INACTIVE", result.get(3).getStatus());

        Person ingo = result.get(0);
        assertEquals("Ingo", ingo.getFirstName());
        assertEquals("INACTIVE", ingo.getStatus());


    }
}