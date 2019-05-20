package com.stackroute.pe4;

import java.util.Comparator;

public class Student {

    private int studentid, studentage;
    private String studentname;

    //create constructor here
    public Student() {
    }

    public Student(int id, String name, int age) {
        this.studentid = id;
        this.studentname = name;
        this.studentage = age;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int id) {
        this.studentid = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String name) {
        this.studentname = name;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int age) {
        this.studentage = age;
    }
    public String toString()
    {
        return this.studentid + " " + this.studentname +
                " " + this.studentage;
    }

}

    //class implement constructor
class StudentSorter implements Comparator<Student> {
        @Override
        public int compare(Student a1, Student a2) {
           //compare student by age id name
            int diff = 0;
            diff = a1.getStudentage() - a2.getStudentage();
            if (diff == 0) {
                {
                    diff = a1.getStudentname().compareTo(a2.getStudentname());
                }
                if (diff == 0)
                    diff = a1.getStudentage() - a2.getStudentage();
            }
            return diff;
        }
    }

