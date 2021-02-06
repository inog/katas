package katalist;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class WordsTest {

    private Words cut;

    @Test
    public void forLoop(){
        cut = new Words();
        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        words.add("bb");
        words.add("ccc");
        cut.forLoop(words);
        //Todo Asserts.
    }


}