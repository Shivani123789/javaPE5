package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;

public class SetinterfaceTest {
    Setinterface obj;
    @Before
    public void setup() {
        //arrenge
        obj = new Setinterface();
    }

    @After
    public  void tearDown() {
        //arrenge
        obj = null;
    }
    @Test
    public void Setinterface_gievset_shouldbesorte()
    {
        Set<String> c=new TreeSet<>();
        //Random r=new Random();
        c.add("hari");
        c.add("olive");
        c.add("alice");
        c.add("bluto");
        c.add("eugen");
       ArrayList<String> actual=obj.orderrandomly(c);
       ArrayList<String> expected=new ArrayList<>(
               Arrays.asList("alice","bluto","eugen","hari","olive"));
               assertArrayEquals(actual.toArray(),expected.toArray());

    }



}
