package katalist;

import java.util.List;
import java.util.stream.Collectors;

public class Action {

    public List<Person> filterListByProperty(List<Person> personList){
        List<Person> muellers = personList.stream()
                .filter(person -> person.getLastName().equals("Müller"))
                .collect(Collectors.toList());

        return muellers;
    }
}