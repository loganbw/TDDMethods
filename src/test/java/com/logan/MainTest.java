package com.logan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void getDivisionDoesCorrectMath() throws Exception {
        double expectedOutput = 0.5;
        assertEquals(expectedOutput, Main.getDivisionOutput("5","10"), 0);
    }
}
