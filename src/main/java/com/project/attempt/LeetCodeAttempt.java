package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(countOfSubstringsContainingEveryVowelAndKConsonantsII("aeioqq", 1));

        System.out.println(countOfSubstringsContainingEveryVowelAndKConsonantsII("aeiou", 0));

        System.out.println(countOfSubstringsContainingEveryVowelAndKConsonantsII("ieaouqqieaouqq", 1));

    }

    // This method returns the number of substrings of string word that contains every vowel
    // at least once and also contains exactly int k amount of consonants.
    public static int countOfSubstringsContainingEveryVowelAndKConsonantsII(String word, int k) {

        // We will store our total number of valid substrings
        // that follow the challenge specifications here.
        int totalSubstrings = 0;

        // We will loop through string word, and perform a second loop
        // at every index to check for all possible substrings.
        for (int i = 0; i < word.length(); i++) {

            // At the start of each outer loop, we set our consonant count to 0. We need to keep
            // track of the exact number as we only want to allow int k consonants in our substring.
            int consonant = 0;

            // Then we also have booleans for each vowel, to keep track or whether they appeared
            // at least once or not. We do not care if they appear multiple times, so we only use
            // a boolean to keep track of them.
            boolean vowel_a = false;
            boolean vowel_e = false;
            boolean vowel_i = false;
            boolean vowel_o = false;
            boolean vowel_u = false;

            // We then conduct our inner loop, which will keep going until the end of string word,
            // or until it detects more than one consonant in the current substring. This loop will
            // be meant for detecting all substrings that begin at index i, and to see how many of
            // them happen to fulfill the challenge specifications.
            for (int j = i; j < word.length(); j++) {

                // For each character in the substring, we will first check
                // to see if it is a vowel or a consonant.
                if (word.charAt(j) == 'a') { vowel_a = true; }
                else if (word.charAt(j) == 'e') { vowel_e = true; }
                else if (word.charAt(j) == 'i') { vowel_i = true; }
                else if (word.charAt(j) == 'o') { vowel_o = true; }
                else if (word.charAt(j) == 'u') { vowel_u = true; }
                else { consonant++; }

                // If the booleans for all the vowels are set to true, and there exactly int k
                // amount of consonants detected so far, then we increment int totalSubstrings.
                if (vowel_a && vowel_e && vowel_i && vowel_o && vowel_u && consonant == k) {
                    totalSubstrings++;
                }

                // If the number of consonants surpass int k, then we break from this inner loop.
                if (consonant > k) { break; }

            }

        }

        // After both the outer and inner loops have concluded, we return int totalSubstrings.
        return totalSubstrings;

    }

}
