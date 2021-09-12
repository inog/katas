package codewars;

import codewars.diffof2colections.java.DiffOf2Collections;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiffOf2CollectionsTest {

    @Test
    public void exampleTests() {
        assertEquals(list(), DiffOf2Collections.diff(list('a', 'b'), list('a', 'b')),"should return empty for the same content");
        assertEquals(list('a', 'b'), DiffOf2Collections.diff(list('a', 'b'), list()),"should return A if B is empty");
        assertEquals(list('a', 'b'), DiffOf2Collections.diff(list(), list('a', 'b')),"should return B if A is empty");
        assertEquals(list(), DiffOf2Collections.diff(list(), list()),"should return empty for the empty content");
        assertEquals(list('z'), DiffOf2Collections.diff(list('a', 'b', 'z'), list('a', 'b')),"should return the last character");
        assertEquals(list('d', 'e', 'j', 'z'), DiffOf2Collections.diff(list('a', 'b', 'z', 'd', 'e', 'd'), list('a', 'b', 'j', 'j')),"should return the sorted characters");
    }

    public List<Character> list(char... elements) {
        ArrayList<Character> list = new ArrayList<>();
        for (char s : elements) {
            list.add(s);
        }
        return list;
    }
}