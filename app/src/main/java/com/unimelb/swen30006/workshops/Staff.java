package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Staff extends Person{

    /**staff teaches 1 or many subjects??**/
    //ArrayList<Subject> subjects = new ArrayList<>();

    /** constructor for Staff class that extends on abstract Person Class**/
    public Staff(String address, Date dob, String name) {
        super(address, dob, name);
    }

}
