package com.azhar.Loop;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] num = {10,20,30,40,50,60,70,80,90};

        int sum=0;

        for (int x:num){
            sum = sum+x;
            System.out.print(x+" + ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
