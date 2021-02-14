package katalist;


import java.util.LinkedList;

/**
Play with Linklist
 **/

public class Linky {

    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(5);
        linky.add(23);
        linky.add(3);

        System.out.println(linky.get(1));
    }
}
