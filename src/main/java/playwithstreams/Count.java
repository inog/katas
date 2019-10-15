package playwithstreams;

import java.util.Arrays;
import java.util.List;

public class Count {

    List<Integer> digits = Arrays.asList(1,2,3,4,5,6);

    public long count (List<Integer> list){
        return list.stream().count();
    }
}
