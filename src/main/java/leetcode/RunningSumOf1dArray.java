package leetcode;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 *
 * Constraints:
 *
 *     1 <= nums.length <= 1000
 *     -10^6 <= nums[i] <= 10^6
 */

class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int x = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i]+x;
            x=result[i];
        }
        return result;
    }

}
