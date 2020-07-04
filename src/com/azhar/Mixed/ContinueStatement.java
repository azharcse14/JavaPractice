package com.azhar.Mixed;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int x=1; x<=100; x=x+3){
            if (x==10){
                continue;
            }
            System.out.println(x+" : Bangladesh");
        }
    }
}
