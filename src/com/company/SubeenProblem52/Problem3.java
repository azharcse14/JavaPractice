package com.company.SubeenProblem52;

public class Problem3 {
    public static void main(String[] args) {
        int i, n=1000;
        int j=1;


        for (i=n;i>=1;i--,j++){

            if(i<10){
                System.out.print(i+"   "+"\t");
            }else if(i<100){
                System.out.print(i+"  "+"\t");
            }else if(i<1000){
                System.out.print(i+" "+"\t");
            }else {
                System.out.print(i+"\t");
            }



            if (j%5==0 && i!=n){
                System.out.println();
            }

        }
    }

}
