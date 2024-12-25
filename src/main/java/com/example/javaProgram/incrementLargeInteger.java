package com.example.javaProgram;

import java.util.*;

public class incrementLargeInteger {
    /**
     * Incrementing a Large Integer:
     * You are given a large integer represented as an integer array digits, where
     * each digits[i] is the ith digit of the integer. The digits are ordered from
     * most significant to least significant in left-to-right order. Increment the
     * large integer by one and return the resulting array of digits.
     * Examples:
     * Input: digits = [1, 2, 3]
     * Output: [1, 2, 4]
     * Explanation: The array represents the integer 123. Incrementing by one gives
     * 123 + 1 = 124, resulting in [1, 2, 4].
     */
    public static void main(String[] args) {
        int a[] = { 1, 2, 4 };
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                a[i]++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
