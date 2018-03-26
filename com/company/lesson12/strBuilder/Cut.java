package com.company.lesson12.strBuilder;

public class Cut {
    public static void main(String[] args) {
        System.out.println(middlePart("Practice"));
        System.out.println(middlePart("Code"));
        System.out.println(middlePart("String"));
    }
    public static String middlePart(String s){
        return s.substring(s.length()/2-1,s.length()/2+1);
    }
}
