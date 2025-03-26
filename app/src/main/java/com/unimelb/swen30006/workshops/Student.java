package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person{

    /**student can have 0 or many submissions**/
    ArrayList<Submission> submissions = new ArrayList<>();

    /** constructor for Student class that extends on abstract Person Class**/
    public Student(String address, Date dob, String name) {
        super(address, dob, name);
    }

    public void sendEmailMsg(String message) {};
    public void totalGrade(float grade) {};
}
