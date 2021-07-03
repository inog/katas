package leetcode;

import org.junit.jupiter.api.Assertions;

/**
 * Example 1:
 * Input: nums = [2,7,11,15], target = t
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

class TwoSumTest {
    TwoSum cut = new TwoSum();

    void twoSum() {
        int[] input = {2, 3, 4};
        int target = 6;
        int[] expected = {1, 2};

        int[] result = cut.twoSum(input, target);

        Assertions.assertArrayEquals(expected, result);
    }
}