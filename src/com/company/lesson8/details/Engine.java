package com.company.lesson8.details;

public class Engine {
    private String engPow, company;

    public Engine(String engPow, String company) {
        this.engPow = engPow;
        this.company = company;
    }

    public String getEngPow() {
        return engPow;
    }

    public void setEngPow(String engPow) {
        this.engPow = engPow;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
