package com.example.myapplication;

import junit.framework.TestCase;

import org.junit.Test;

public class colorTest extends TestCase {

    @Test
    public void Testred()
    {
        Red r= new Red();
        assertEquals("Red\n",r.showColor());
    }
    @Test
    public void testGreen() {
        Green g = new Green();
        assertEquals("Green\n", g.showColor());
    }

    @Test
    public void testBlue() {
        Blue b = new Blue();
        assertEquals("\n", b.showColor());
    }
}