package com.company.lesson8;

public class Aspirant extends Student {
    private String phWork;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String phWork) {
        super(firstName, lastName, group, avgMark);
        this.phWork = phWork;
    }

    public String getPhWork() {
        return phWork;
    }

    public void setPhWork(String phWork) {
        this.phWork = phWork;
    }
}
