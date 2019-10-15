package playwithstreams;

import org.assertj.core.api.Assertions;

import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;

public class CountTest {
    Count cut = new Count();

    @Test
    public void count() {
        long result = cut.count(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Assertions.assertThat(result).isEqualTo(8);
    }
}