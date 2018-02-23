package com.company.lesson7;

/**
 * Created by Student on 23.02.2018.
 */
public class Library {   private String fullName,lcNum,
        fac,bd,phNum;

    public Library(String fullName,String lcNum,String fac,String bd,String phNum){
        this.fullName=fullName;
        this.lcNum=lcNum;
        this.fac=fac;
        this.bd=bd;
        this.phNum=phNum;
    }
    Library(){
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLcNum() {
        return lcNum;
    }

    public void setLcNum(String lcNum) {
        this.lcNum = lcNum;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        phNum = phNum;
    }
    void takeBook(int q){
        System.out.println(this.fullName+" take "+ q +" books.");
    }
    void takeBook(String... titles){System.out.println(this.fullName+" take ");
        for (String t:titles) {
            System.out.println(t + " ");
        }
        System.out.println();
    }
    void takeBook(Book...example){
        System.out.println(this.fullName + " take ");
        for (Book ex:example) {
            System.out.println( ex.getName()+","+ex.getWriter()+";");
        }
        System.out.println();
    }
    void returnBook(int q){
        System.out.println(this.fullName+" return "+ q +" books.");
    }
    void returnBook(String... titles){
        System.out.print(this.fullName + " return: ");
        for (String t:titles) {
            System.out.print(t+" ");
        }
        System.out.println();
    }
    void returnBook(Book...example){
        System.out.print(fullName+"return:");
        for (Book ex:example) {
            System.out.print(ex.getName()+","+ex.getWriter()+";");
        }
        System.out.println();
    }
}
