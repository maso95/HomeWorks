package com.company.lesson7;

public class MyPhone {
    public static void main(String[] args) {
        Phone asus =new Phone("0968239412","A75M",0.871);
        Phone apple = new Phone("0667417555","IPhone X");
        Phone lg = new Phone();
        System.out.println(Phone.getCount());

        System.out.println("ASUS: "+ " Number: "+asus.getNumber()+" Modle: "+asus.getModel()+" Weight: "+asus.getWeight());

        System.out.println("Apple: "+ " Number: "+apple.getNumber()+" Modle: "+apple.getModel()+" Weight: "+apple.getWeight());

        System.out.println("LG: "+ " Number: "+lg.getNumber()+" Modle: "+lg.getModel()+" Weight: "+lg.getWeight());

        asus.reciveCall(" Mom ");
        asus.reciveCall(" Mom ","0968239412");
        System.out.println(asus.getNumber());

        asus.sendMessage("0968239412");
        apple.sendMessage("0667417555","0652397513","0986120386");
    }
}
