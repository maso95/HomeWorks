package com.company.lesson12.strBuilder;

/**
 * Created by Student on 16.03.2018.
 */
public class StringBuilderAppDemo {
    public static void main(String[] args) {
        caculatet(3,56);
    }

    private static void caculatet(int a,int b) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(a).append(" + ").append(b).append(" = ").append( a+ b ).append("\n");
        stringBuilder.append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n");
        stringBuilder.append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");
        int pos = 0;
        while( (pos = stringBuilder.indexOf("="))!=-1){
            stringBuilder.replace(pos,pos+1,"равно");
        }
        System.out.println(stringBuilder);
    }
}
