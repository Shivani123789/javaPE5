package com.stackroute.pe4;

import java.util.ArrayList;

public class UpdateArrayElement {

    public ArrayList updateelement(ArrayList<String> str )
    {     ArrayList<String>s2=str;
        str.set(0,"Mango");
         str.set(2,"papaya");
        System.out.println(str);
      return  str;


    }
}
