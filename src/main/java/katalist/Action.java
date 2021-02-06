package katalist;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Action {

    public List<Person> filterListByProperty(List<Person> personList){
        Map<Integer,Person> lastStatusMap = new LinkedHashMap<>();

        personList.forEach(person -> lastStatusMap.put(person.getId(), person));
        return new ArrayList<> (lastStatusMap.values());
    }
}