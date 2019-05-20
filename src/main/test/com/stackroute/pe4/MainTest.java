package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    Student details;

    @Before
    public void setup() {
        //arrenge
       details = new Student();
    }

    @After
    public  void tearDown() {
        //arrenge
        details = null;
    }
    @Test

    public void student_Givenstudentobject_shouldbesorted() {
        //students object for 5 students
        Student s1 = new Student(1, "shivani", 24);
        Student s2 = new Student(2, "madhuri", 25);
        Student s3 = new Student(3, "neha", 24);
        Student s4 = new Student(4, "shivani", 22);
        Student s5 = new Student(5, "minal", 20);
        // list of type students
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        // store all list elements in list
        for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
        Collections.sort(al, new StudentSorter());
            System.out.println("\nSorted list");
            for (int i=0; i<al.size(); i++)
                System.out.println(al.get(i));
        }
    }
