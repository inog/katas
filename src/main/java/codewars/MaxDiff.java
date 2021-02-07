package codewars;

import java.util.Arrays;

/**
 * You must implement a function that return the difference between the biggest and the smallest value in a list(lst) received as parameter.
 * The list(lst) contains integers, that means it may contain some negative numbers.
 * If the list is empty or contains a single element, return 0.
 * The list(lst) is not sorted.
 */

public class MaxDiff {
    public static int maxDiff(int[] lst) {
        int min = Arrays.stream(lst).min().orElse(0);
        int max = Arrays.stream(lst).max().orElse(0);
        return max - min;
    }
}
