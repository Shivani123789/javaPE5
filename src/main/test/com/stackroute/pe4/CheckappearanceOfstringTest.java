package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CheckappearanceOfstringTest {

    CheckappearanceOfstring obj;
    @Before
    public void setup() {
        //arrenge
       obj = new CheckappearanceOfstring();
    }

    @After
    public  void tearDown() {
        //arrenge
        obj = null;
    }

    @Test
    public void checkstring_givenstring_shouldBeTrue()
    {
      String [] s1={"a","b","c","d","a","c","c"};
        HashMap<String, Boolean> expected = new HashMap<>();
        HashMap<String, Boolean> actual=obj.checkstring(s1);
        // Mapping string to boolean value
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        System.out.println(expected);
        assertEquals(actual,expected);



    }
}
