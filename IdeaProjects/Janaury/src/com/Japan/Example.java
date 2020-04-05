package com.Japan;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num:");
        int n=input.nextInt();
        int i,j;
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
