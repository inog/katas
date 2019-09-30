package katalist;

import java.util.*;
import java.util.stream.Collectors;

public class Action {

    public List<Person> filterListByProperty(List<Person> personList){
        Map<String,Person> lastStatusMap = new LinkedHashMap<>();
        personList.forEach(person -> {
            lastStatusMap.put(person.getFirstName(), person);
        });
        List<Person> values = new ArrayList<Person> (lastStatusMap.values());
        return values;
    }
}