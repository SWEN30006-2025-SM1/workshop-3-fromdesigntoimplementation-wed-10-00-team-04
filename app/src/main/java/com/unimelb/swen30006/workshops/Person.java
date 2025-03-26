package com.unimelb.swen30006.workshops;

import java.util.Date;

public abstract class Person {

    private final String address;
    private final Date dob;
    private final String name;

    /** constructor for Person class **/
    public Person(String address, Date dob, String name) {
        this.address = address;
        this.dob= dob;
        this.name = name;
    }
}
