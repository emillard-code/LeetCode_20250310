package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(countOfSubstringsContainingEveryVowelAndKConsonantsII("aeioqq", 1));

        System.out.println(countOfSubstringsContainingEveryVowelAndKConsonantsII("aeiou", 0));

        System.out.println(countOfSubstringsContainingEveryVowelAndKConsonantsII("ieaouqqieaouqq", 1));

    }

    public static int countOfSubstringsContainingEveryVowelAndKConsonantsII(String word, int k) {

        int totalSubstrings = 0;

        for (int i = 0; i < word.length(); i++) {

            int consonant = 0;

            boolean vowel_a = false;
            boolean vowel_e = false;
            boolean vowel_i = false;
            boolean vowel_o = false;
            boolean vowel_u = false;

            boolean validSubstring = false;

            for (int j = i; j < word.length(); j++) {

                if (word.charAt(j) == 'a') { vowel_a = true; }
                else if (word.charAt(j) == 'e') { vowel_e = true; }
                else if (word.charAt(j) == 'i') { vowel_i = true; }
                else if (word.charAt(j) == 'o') { vowel_o = true; }
                else if (word.charAt(j) == 'u') { vowel_u = true; }
                else { consonant++; }

                if (vowel_a && vowel_e && vowel_i && vowel_o && vowel_u && consonant == k) {
                    validSubstring = true;
                    break;
                }

                if (consonant > k) { break; }

            }

            if (validSubstring) { totalSubstrings++; }

        }

        return totalSubstrings;

    }

}
