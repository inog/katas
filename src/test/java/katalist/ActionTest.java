package katalist;


import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ActionTest {
    Action cut;

    @Before
    public void setUp(){
        cut = new Action();
    }

    @Test
   public void filterListByProperty() {
        List<Person> personList = new ArrayList();
        personList.add(new Person("Ingo", "Reschke", 42));
        personList.add(new Person("Tapio","Reschke",9));
        personList.add(new Person("Juna","Reschke",7));
        personList.add(new Person("Mio","Reschke",4));

        List<Person> result = cut.filterListByProperty(personList);
        Assert.assertNotNull(result);
        Assert.assertEquals(4, personList.size());
        Assertions.assertThat(personList.size()).isEqualTo(4);

    }
}