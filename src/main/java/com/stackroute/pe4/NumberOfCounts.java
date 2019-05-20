package com.stackroute.pe4;
import java.util.*;

public class NumberOfCounts {
    public Map<String, Integer> countFrequencies(String str) {
// using method to count frequency
        //first converted string to array list
        StringTokenizer multiTokenizer = new StringTokenizer(str, "://.- __ @ * ? ,");
        ArrayList<String> names = new ArrayList<String>();

        while (multiTokenizer.hasMoreTokens()) {
            names.add(multiTokenizer.nextToken());
        }
        //initialise map to store key value of arraylist as per condition
        Map<String, Integer> num = new HashMap<String, Integer>();
// loop use names array list to map
        for (String i : names) {

            if (num.containsKey(i)) {
                num.put(i, num.get(i) + 1);
            } else {
                //if there is no element peresent put 1 for that
                num.put(i, 1);
            }
        }
        // key value pairs are printed
        System.out.println(num);
        return num;

    }
}



