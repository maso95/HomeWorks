package com.company.lesson7;

public class Phone {
        String number ;
        String model;
        Double weight;
        Phone(String n, String m,Double w){
               this(n,m);
                weight=w;
        }
        Phone(String n,String m){
                number=n;
                model=m;

        }
        Phone(){}
        void reciveCall(String name){
                System.out.println("Call"+name);
        }
        void reciveCall(String name,String number){
                System.out.println("Call: "+name+ " Number: "+number);
        }
        String getNumber(){
                return number;
        }
}

