package com.company.lesson7;

public class Phone {
        static private int count;
        private String number ;
        private String model;
        private Double weight;
        Phone(String n, String m,Double w){
               this(n,m);
                weight=w;

        }
        Phone(String n,String m){
                number=n;
                model=m;
              count++;
        }
        Phone(){
                count++;
        }

        public static int getCount() {
                return count;
        }

        public String getNumber() {
                return number;
        }

        public void setNumber(String number) {
                this.number = number;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public Double getWeight() {
                return weight;
        }

        public void setWeight(Double weight) {
                this.weight = weight;
        }

        void reciveCall(String name){
                System.out.println("Call"+name);
        }

        void reciveCall(String name,String number){
                System.out.println("Call: "+name+ " Number: "+number);
        }




        void sendMessage(String... numbers){
                System.out.println("Message sand");
                for (String number : numbers) {
                        System.out.print(number + ", ");

                }


        }

}

