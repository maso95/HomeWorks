package com.company.lesson12.strBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shift {
    public static void main(String[] args) {
        System.out.println(shiftIt("object oriented programming is awesome"));
        System.out.println(shiftIt("i'm learning about object   oriented     programming"));
        System.out.println(shiftIt("askgjasdklgjls object oriented programming l;jgfhyue"));

    }
    public static String shiftIt(String s){
        Pattern pattern = Pattern.compile("object\\s*oriented\\s+programming", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            s = matcher.replaceAll("OOP");
        }
        return s;
    }
}
