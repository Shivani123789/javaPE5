package com.stackroute.pe4;

import java.util.HashMap;
import java.util.Map;

public class CheckappearanceOfstring {
     public HashMap<String,Boolean> checkstring(String [] str)
    {
        //initialise map to store key value of array string as per condition
        //this can also take arraylist
        //here map used to count elements so string and integer
        Map<String,Integer> counting = new HashMap<>();
        // loop use str StringArray to map and occurance of each element in arraystring
        for (String j :str) {
            Integer k = counting.get(j);
            counting.put(j, (k == null) ? 1 : k + 1);
        }
//
//
//        }
        HashMap<String, Boolean> result = new HashMap<>();
        for (Map.Entry<String, Integer> element : counting.entrySet())
        {
            if (element.getValue() > 1)
            {
                result.put(element.getKey(), true);
            }
            else
            {
                result.put(element.getKey(), false);
            }
        }
        return result;
    }

    }

