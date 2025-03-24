package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void countOfSubstringsContainingEveryVowelAndKConsonantsIITest() {

        assertEquals(0, LeetCodeAttempt.countOfSubstringsContainingEveryVowelAndKConsonantsII("aeioqq", 1));

        assertEquals(1, LeetCodeAttempt.countOfSubstringsContainingEveryVowelAndKConsonantsII("aeiou", 0));

        assertEquals(3, LeetCodeAttempt.countOfSubstringsContainingEveryVowelAndKConsonantsII("ieaouqqieaouqq", 1));

    }

}
