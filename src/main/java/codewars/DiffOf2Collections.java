package codewars;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DiffOf2Collections {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {

        Set<Character> setA = a.stream()
                .filter(item -> !b.contains(item))
                .collect(Collectors.toSet());
        Set<Character> setB = b.stream()
                .filter(item -> !a.contains(item))
                .collect(Collectors.toSet());

        setA.addAll(setB);


        return  setA.stream().collect(Collectors.toList());
    }
}

