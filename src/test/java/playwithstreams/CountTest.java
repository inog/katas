package playwithstreams;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class CountTest {
    final Count cut = new Count();

    @Test
    public void count() {
        long result = cut.count(Arrays.asList(1,2,3,4,5,6,7,8));
        Assertions.assertEquals(8, result);
    }
}