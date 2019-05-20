package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class NumberOfCountsTest {
    NumberOfCounts element;

    @Before
    public void setup() {
        //arrenge
        element = new NumberOfCounts();
    }

    @After
    public  void tearDown() {
        //arrenge
        element = null;
    }
    @Test
    public void NumberOfCounts_GivenSting_shouldbekeyvaluepair()
    {
        String s1="one one -one__two,,three,one @three*one?two";
        Map<String, Integer>actual= element.countFrequencies(s1);
        HashMap<String, Integer>expected = new HashMap<>();

        // Mapping string values to int keys
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        System.out.println(expected);
      assertEquals(actual,expected);



    }

}
