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
        personList.add(new Person("Ingo", "Müller", 42));
        personList.add(new Person("Tapio","Müller",9));
        personList.add(new Person("Juna","Müller",7));
        personList.add(new Person("Mio","Müller",4));
        personList.add(new Person("Mio","Maier",4));

        List<Person> result = cut.filterListByProperty(personList);
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(4);

    }
}