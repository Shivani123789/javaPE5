package com.stackroute.pe4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mappingkeyvalue {
    public HashMap<String,String> checkmap(HashMap<String, String> input)
    {
        System.out.println(input);
        //here map used to count elements so string and integer
        // loop use str StringArray to map and occurance of each element in arraystring
     //   Map<String,String> counting = new HashMap<>();
        HashMap<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : input.entrySet())
            if (entry.getValue() != null)
            {
                result.put("val1", "null");
                result.put("val2", "mars");
        }
        return result;

    }
}
