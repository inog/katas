package katalist;


import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class ActionTest {
    Action cut;

    @Before
    public void setUp(){
        cut = new Action();
    }

    @Test
   public void filterListByProperty() {
        List<Person> personList = new ArrayList();
        personList.add(new Person(0,"Ingo", "Müller", 42, Person.Status.ACTIV.toString()));
        personList.add(new Person(1,"Tapio","Müller",9, Person.Status.ACTIV.toString()));
        personList.add(new Person(2,"Juna","Müller",7, Person.Status.ACTIV.toString()));
        personList.add(new Person(3,"Mio","Müller",4,Person.Status.ACTIV.toString()));
        personList.add(new Person(3,"Mio","Müller",4,Person.Status.INACTIV.toString()));
        personList.add(new Person(3,"Mio","Müller",4,Person.Status.ACTIV.toString()));
        personList.add(new Person(3,"Mio","Müller",4,Person.Status.INACTIV.toString()));
        personList.add(new Person(3,"Mio","Müller",4,Person.Status.ACTIV.toString()));
        personList.add(new Person(3,"Mio","Müller",4,Person.Status.INACTIV.toString()));
        personList.add(new Person(4,"Mio","Maier",4,Person.Status.ACTIV.toString()));
        personList.add(new Person(0,"Ingo", "Müller", 42, Person.Status.INACTIV.toString()));

        List<Person> result = cut.filterListByProperty(personList);
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(4);
        assertThat(result.get(3).getFirstName()).isEqualTo("Mio");
        assertThat(result.get(3).getStatus()).isEqualTo("INACTIV");

        Person ingo = result.get(0);
        assertThat(ingo.getFirstName()).isEqualTo("Ingo");
        assertThat(ingo.getStatus()).isEqualTo("INACTIV");

    }
}