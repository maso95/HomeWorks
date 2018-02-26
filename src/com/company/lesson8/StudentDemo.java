package com.company.lesson8;

/**
 * Created by Student on 23.02.2018.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Aspirant("Mike", "Handriks", "Ph-1", 4.7, "Applied Physics");
        Aspirant a = new Aspirant("Alex", "Riot", "Pr-3", 4.2, "Applied Physics");
        Student rs = new Student("Tom", "Ford", "SE-2", 4);

        Student[]m = {s,a,rs};
        for (Student f :m) {
            System.out.println(f.getLastName()+" "+f.getShcolarship());
        }

        System.out.println(s.getFirstName() + " " + s.getLastName() + ", Group:" + s.getGroup() + ", AvgMark:" + s.getAvgMark()+".");
        System.out.println(a.getFirstName() + " " + a.getLastName() + ", Group:" + a.getGroup() +
                ", AvgMark:" + a.getAvgMark() + ", PhWork" + a.getPhWork()+".");
        System.out.println(rs.getFirstName() + " " + rs.getLastName() + ", Group:" + rs.getGroup() + ", AvgMark:" + rs.getAvgMark());
    }

}
