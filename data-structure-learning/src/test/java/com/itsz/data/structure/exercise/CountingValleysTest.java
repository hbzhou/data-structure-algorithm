package com.itsz.data.structure.exercise;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CountingValleysTest {

    @ParameterizedTest
    @CsvSource({"1,8,'UDDDUDUU'", "2,12,'DDUUDDUDUUUD'"})
    public void name(int expect, int n, String input ) {
        assertEquals(expect, CountingValleys.countingValleys(n, input));
    }
}