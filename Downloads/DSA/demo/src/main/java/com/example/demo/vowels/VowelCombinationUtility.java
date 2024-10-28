package com.example.demo.vowels;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VowelCombinationUtility {

    public static void main(String[] args) {
        String input = "educa";
        List<String> combinations = getVowelCombinations(input);

        System.out.println("Combinations of same length that start and end with a vowel:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<String> getVowelCombinations(String input) {
        Set<String> result = new HashSet<>();  // Use a set to avoid duplicates
        permute(input.toCharArray(), 0, result);

        // Filter for those that start and end with a vowel
        List<String> filteredResult = new ArrayList<>();
        for (String permutation : result) {
            if (isVowel(permutation.charAt(0)) && isVowel(permutation.charAt(permutation.length() - 1))) {
                filteredResult.add(permutation);
            }
        }

        return filteredResult;
    }

    private static void permute(char[] chars, int currentIndex, Set<String> result) {
        if (currentIndex == chars.length - 1) {
            result.add(new String(chars));  // Add the permutation to the set
            return;
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            permute(chars, currentIndex + 1, result);
            swap(chars, currentIndex, i);  // Swap back to backtrack
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
