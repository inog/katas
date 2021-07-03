package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningSumOf1dArrayTest {
    RunningSumOf1dArray cut = new RunningSumOf1dArray();

    @Test
    void runningSum(){
        int[] input = {1, 1, 1, 1,1};
        int[] expected = {1,2,3,4,5};

        int[] result = cut.runningSum(input);

        Assertions.assertArrayEquals(expected, result);
    }
}