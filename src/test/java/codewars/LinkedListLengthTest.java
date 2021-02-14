package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListLengthTest {

    @Test
    public void basicTests() {
        assertEquals(0, LinkedListLength.length(null));
    }

    @Test
    public void shouldPass() {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4))));

        assertEquals(4, LinkedListLength.length(head));
    }

}