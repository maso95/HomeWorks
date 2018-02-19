package com.company.lesson7;

public class MyPhone {
    public static void main(String[] args) {
        Phone asus =new Phone("0968239412","A75M",0.871);
        Phone apple = new Phone("0667417555","IPhone X");
        Phone lg = new Phone();

        System.out.println("ASUS: "+ " Number: "+asus.number+" Modle: "+asus.model+" Weight: "+asus.weight);

        System.out.println("Apple: "+ " Number: "+apple.number+" Modle: "+apple.model+" Weight: "+apple.weight);

        System.out.println("LG: "+ " Number: "+lg.number+" Modle: "+lg.model+" Weight: "+lg.weight);

        asus.reciveCall(" Mom ");
        asus.reciveCall(" Mom ","0968239412");
        System.out.println(asus.getNumber());
    }
}
