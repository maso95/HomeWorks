package com.company.lesson8.details;

public class Engine {
    private String EngPow, company;

    public Engine(String engPow, String company) {
        EngPow = engPow;
        this.company = company;
    }

    public String getEngPow() {
        return EngPow;
    }

    public void setEngPow(String engPow) {
        EngPow = engPow;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
