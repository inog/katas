package katalist;


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
        List<Person> result = cut.filterListByProperty(new ArrayList<Person>());
        Assert.assertNotNull(result);

    }
}