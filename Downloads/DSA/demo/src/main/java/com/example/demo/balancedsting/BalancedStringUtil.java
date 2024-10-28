package com.example.demo.balancedsting;

import java.util.Stack;

public class BalancedStringUtil {
    /*
    best, average,worst time and space complexity=O(n)
    */

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /*
        best, average,worst time and space complexity=O(1)
        */
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    /*
        best, average,worst time and space complexity=O(n)
        */
    public static String checkIfBalanced(String input) {
        if (isBalanced(input)) {
            return "The input string is balanced.";
        } else {
            return "The input string is NOT balanced.";
        }
    }

    public static void main(String[] args) {
        String input1 = "(([]))";
        String input2 = "([)]";

        System.out.println("Input: " + input1 + " -> " + checkIfBalanced(input1));
        System.out.println("Input: " + input2 + " -> " + checkIfBalanced(input2));
    }
}
