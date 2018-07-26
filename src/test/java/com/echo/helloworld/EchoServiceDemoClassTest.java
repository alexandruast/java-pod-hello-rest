package com.echo.helloworld;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.internal.AssumptionViolatedException;

public class EchoServiceDemoClassTest {
    static EchoServiceDemoClass test = new EchoServiceDemoClass();
    
    @Test
    public void testRandomFail() {
        double r = Math.random();
        if (r < 0.2) {
            throw new AssumptionViolatedException("skipping");
        }
    }
    
    @Test
    public void testAddOne() {    
        int out = test.addOne(9);
        assertTrue(out == 10);
    }
}