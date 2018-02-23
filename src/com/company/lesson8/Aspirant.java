package com.company.lesson8;

/**
 * Created by Student on 23.02.2018.
 */
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
