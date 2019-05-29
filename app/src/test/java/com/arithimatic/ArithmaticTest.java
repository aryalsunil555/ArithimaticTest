package com.arithimatic;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArithmaticTest {
    @Test
    public void testAddition() {
        Arithmatic arithmatic = new Arithmatic();
        float expextedResult = 10;
        float actualResult = arithmatic.add(4,6);
        assertEquals(expextedResult,actualResult);
    }
    @Test
    public void testSubtraction()
    {
        Arithmatic arithmatic = new Arithmatic();
        float expectedResult = 10;
        float actualResult = arithmatic.subtract(4,6);
        assertEquals(expectedResult,actualResult);

    }

}
