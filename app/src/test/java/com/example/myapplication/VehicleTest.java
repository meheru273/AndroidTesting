package com.example.myapplication;

import junit.framework.TestCase;

import org.junit.Test;

public class VehicleTest extends TestCase {

    @Test

    public void Testsedan()
    {
        Sedan s= new Sedan();
        assertEquals(4,s.getWheels());
        assertEquals(2,s.getFuel());
        assertEquals(5,s.getMileage());

    }
    @Test
    public void Testmotorcycle()
    {
        motorcycle m= new motorcycle();
        assertEquals(2,m.getWheels());
        assertEquals(1.5,m.getFuel());
        assertEquals(0.5,m.getMileage());

    }

    @Test
    public void Testsuv()
    {
        suv v =new suv();
        assertEquals(4,v.getWheels());
        assertEquals(4,v.getFuel());
        assertEquals(2.5,v.getMileage());

    }


}