package com.Japan;


public class ExampleVoid {
    public static void main(String[] args) {
        int a =30;
        int b =45;
        System.out.println("Before swapping, a="+a+"and b="+b);
        //invoke the swap method
        swapFunction(a,b);
        System.out.println("\n**Now,Before and after swapping values will be same here**");
        System.out.println("After swapping, a="+a+"a and b is"+b);
    }
    public static void swapFunction(int a, int b){
        System.out.println("Before swapping(inside),a="+a+"b="+b);
        //swap n1 with n2
        int c =a;
        a=b;
        b=c;
        System.out.println("After swapping(inside),a="+a+"b="+b);
    }

}
