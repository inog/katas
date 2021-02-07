package katalist;

import java.util.ArrayList;
import java.util.List;

public class Words {

    public void forLoop(List<String> words){
        for(int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }
    }

    public void foreachLoop(List<String> words){
        for(String word : words){
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        words.add("bb");
        words.add("ccc");

        //traditional way befor Java 5
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        //for each
        for (String word : words) {
            System.out.println(word);
        }

        //foreach Lambda java8 on Collection
        words.forEach(word -> System.out.println(word));
        // foreach Method reference on Collection
        words.forEach(System.out::println);

        //remove
        words.removeIf(word -> word.length() < 2);
        System.out.println("+++++++++++++++++++++++++++++");
        words.forEach(System.out::println);
    }

}
