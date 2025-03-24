package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void countOfSubstringsTest() {

        assertEquals(0, LeetCodeSolution.countOfSubstrings("aeioqq", 1));

        assertEquals(1, LeetCodeSolution.countOfSubstrings("aeiou", 0));

        assertEquals(3, LeetCodeSolution.countOfSubstrings("ieaouqqieaouqq", 1));

    }

}
