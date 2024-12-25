package com.example.javaProgram;

public class longestSubstring {
    /**
     * Longest Substring Without Repeating Characters:
     * 
     * Input: "ABCBC"
     * Output: 3
     * Explanation: The longest substring without repeating characters is "ABC",
     * which has a length of 3.
     * Input: "AAA"
     * Output: 1
     * Explanation: The longest substring without repeating characters is "A", which
     * has a length of 1.
     */
    public static void main(String[] args) {
        String a = "ABCBC";
        System.out.println(longestSub(a));
        String b = "AAA";
        System.out.println(longestSub(b));
    }

    public static int longestSub(String c) {

        int count = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.indexOf(c.charAt(i)) == c.lastIndexOf(c.charAt(i)) || c.indexOf(c.charAt(i)) == i) {
                count++;
            }
        }
        return count;
    }
}
