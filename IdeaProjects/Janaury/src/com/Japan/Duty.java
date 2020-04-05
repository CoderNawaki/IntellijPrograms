package com.Japan;
import java.util.Scanner;
import java.lang.Math;
public class Duty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = in.nextInt();
        int i,j,t;
        for(i=1;i<=n;i++){
            t=(int)((1+(float)i)/2*i);
            for(j=-i+1;j<1;j++)
            {
                System.out.print(t-Math.abs(j)+"");
            }
            System.out.println("");
        }
    }
}
