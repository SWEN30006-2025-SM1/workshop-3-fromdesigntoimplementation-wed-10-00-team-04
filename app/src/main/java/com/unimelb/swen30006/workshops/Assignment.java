package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;

    public Assignment(String description, Date dueDate, int maxAttempts, String name) {
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.name = name;
    }

    public Submission[] invalidSubmission(){
    }

    public Submission[] validSubmissions(){
    }



    // Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
