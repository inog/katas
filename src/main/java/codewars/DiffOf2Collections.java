package codewars;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DiffOf2Collections {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {

        List<Character> list = a.stream()
                .filter(item -> !b.contains(item))
                .collect(Collectors.toList());

        return list;
    }
}

