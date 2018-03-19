package com.company.lesson10.musicShop;

import java.util.Objects;

public class Guitar implements Instruments {
    String strNum;

    public Guitar(String strNum) {
        this.strNum = strNum;
    }

    public String getStrNum() {
        return strNum;
    }

    public void setStrNum(String strNum) {
        this.strNum = strNum;
    }

    @Override
    public void play() {
        System.out.println("Playing guitar with " + getStrNum() + " strings");
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return strNum == guitar.strNum;
    }

    @Override
    public int hashCode() {

        return Objects.hash(strNum);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "strNum=" + strNum +
                '}';
    }
}
