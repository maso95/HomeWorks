package com.company.lesson5;

public class Week {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
            default:
                System.out.println("Wrong number");
        }
    }
}
