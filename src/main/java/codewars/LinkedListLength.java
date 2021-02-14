package codewars;


public class LinkedListLength {

    static int length(Node head) {
        if(head == null) return 0;

        int i = 1;
        Node current = head;
        while (current.next != null){
            current = current.next;
            i++;
        }
        return i;
    }
}

