package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MappingkeyvalueTest {
    Mappingkeyvalue obj;
    @Before
    public void setup() {
        //arrenge
        obj = new Mappingkeyvalue();
    }

    @After
    public  void tearDown() {
        //arrenge
        obj = null;
    }

    @Test
    public void Mappingkeyvalue_givenkeyvalue_shouldreturnMap()
    {
        HashMap<String, String> input = new HashMap<>();
        input.put("val1","mars");
        input.put("val2", "saturn");
        System.out.println(input);
        HashMap<String, String> actual=obj.checkmap(input);
        HashMap<String, String> expected = new HashMap<>();
        expected.put("val1","null");
        expected.put("val2", "mars");
        System.out.println(expected);
        assertEquals(actual,expected);



    }
}
