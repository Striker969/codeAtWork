package com.example.javaProgram;

public class longestCommonPrefix {
    /*
     * Longest Common Prefix:
     * Write a function to find the longest common prefix string amongst an array of
     * strings. If there is no common prefix, return an empty string "".
     * Examples:
     * Input: strs = ["flower", "flow", "flight"]
     * Output: "fl"
     * Input: strs = ["dog", "racecar", "car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */

     public static void main(String[] args) {
        String a[]={"flower", "flow", "flight"};
        System.out.println(commonPrefix(a));
        String c[]={"dog", "racecar", "car"};
        System.out.println(commonPrefix(c));
     }
     public static String commonPrefix(String b[]){

        String prefix = b[0];
        for(int i=1;i<b.length;i++){
            while (b[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                System.out.println("");
            }
        }
        return prefix;
     }
     
}
