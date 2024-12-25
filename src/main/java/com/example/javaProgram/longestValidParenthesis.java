package com.example.javaProgram;

import java.util.Stack;

public class longestValidParenthesis {
    /**
     * Longest Valid Parentheses Substring:
     * Input: "((()"
     * Output: 2
     * Explanation: The longest valid parentheses substring is (), which has a
     * length of 2.
     * Input: ")()())"
     * Output: 4
     * Explanation: The longest valid parentheses substring is ()(), which has a
     * length of 4
     */
    public static void main(String[] args) {
        String a = "((()";
        System.out.println(validParatheses(a));
        String b = ")()())";
        System.out.println(validParatheses(b));
    }

    public static int validParatheses(String c) {

        Stack<Integer> x= new Stack<>();
        x.push(-1);
        int maxlength =0;

        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='('){
                x.push(i);
            }else{
                x.pop();
                if(x.isEmpty()){
                    x.push(i);
                }
                else{
                    maxlength = Math.max(maxlength,i-x.peek());
                }
            }
        }
        return maxlength;
    }
}
