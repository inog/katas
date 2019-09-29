package katalist;

import java.util.*;
import java.util.stream.Collectors;

public class Action {

    public List<Person> filterListByProperty(List<Person> personList){
      //  List<Person> muellers = personList.stream()
      //          .filter(person -> person.getLastName().equals("Müller"))
      //          .collect(Collectors.toList());

        Map<Integer,Person> lastStatusMap = new LinkedHashMap<>();
        personList.forEach(person -> {
            lastStatusMap.put(person.getId(), person);
        });
        List<Person> values = new ArrayList<> (lastStatusMap.values());
        return values;
    }
}