package com.Japan;
import java.util.*;
public class Pattern{
    public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
        System.out.print("Enter num:");
        int n = in.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}