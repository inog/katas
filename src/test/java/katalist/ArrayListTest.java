package katalist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {

    public static final int INITIAL_CAPACITY = 100;

    @Test
    void shouldDemonstrateArrayListt(){
        List<String> elements = new ArrayList<>(INITIAL_CAPACITY);
        elements.add("A");
        elements.add("B");
        elements.add("A");
        elements.add("C");
        elements.add("E");
        elements.add(0,"T");
        elements.clear();


        assertTrue(elements.isEmpty());
        System.out.println(elements.indexOf("A"));

    }
}
