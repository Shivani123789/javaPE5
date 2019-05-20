package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;
import java.util.Arrays;

public class UpdateArrayElementTest {
    UpdateArrayElement ArrElement;
    @Before
    public void setup() {
        //arrenge
        ArrElement = new UpdateArrayElement();
    }

    @After
    public  void tearDown() {
        //arrenge
        ArrElement = null;
    }
    @Test
    public void updateSpecificarrayelement_inputarraygiven_shouldreturnupadetedarray()
    {
        ArrayList<String> s1 = new ArrayList<String>(
                Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        ArrayList<String> actual=ArrElement.updateelement(s1);

//        ArrayList<String> expected=[Apple, Grape, Melon, Berry];
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("Mango", "Grape", "papaya", "Berry"));
        assertArrayEquals(actual.toArray(),expected.toArray());
        actual.clear();
        System.out.println(" Array List after removing all elements" +actual);
    }

}