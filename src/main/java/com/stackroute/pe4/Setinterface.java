package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Setinterface {
    public ArrayList<String> orderrandomly(Set<String> s)
    {
        System.out.println(s);
        //using size function
        int num=s.size();
        List<String>  alist=new ArrayList<>(num);
        for(String i:s)
            //add all element in list
            alist.add(i);
        System.out.println(alist);

        return (ArrayList<String>) alist;
    }
}
