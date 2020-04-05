package com.Japan;

public class IfCondition {
    public static void main(String[] args) {
     int x=100;
     if(x>0){
         int y=200;
         System.out.println("x:"+x);
         System.out.println("y:"+y);
         x++;
         y++;
     }
        System.out.println("x:"+x);
        //System.out.println("y:"+y);->error
    }
}
