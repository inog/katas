package playwithstreams;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class IterateAndRemove {
    public static void main(String[] args) {
        List<String> schiffe = new ArrayList<>(asList("Santa Maria", "uss enterprise"));
        System.out.println(schiffe);

        // ConcurrentModificationException RuntimeException
//        for (String schiff:schiffe){
//            if(Character.isLowerCase(schiff.charAt(0))){
//                schiffe.remove(schiff);
//            }
//        }
        // Java 8
//        for (Iterator<String> iterator = schiffe.iterator(); iterator.hasNext(); ) {
//            String schiff = iterator.next();
//            if (Character.isLowerCase(schiff.charAt(0))) {
//                iterator.remove();
//            }
//        }
        schiffe.removeIf(schiff -> Character.isLowerCase(schiff.charAt(0)));

        System.out.println(schiffe);
    }
}
