package com.Japan;

import java.util.stream.IntStream;
//A palindrome is a string which can be written in reverse and still be the same.
// checking palindrome through Streams,Reverse String,Recursion,while loop,for loop,
public class PalindromeCheck {
    public static void main(String args[]){
        //[Streams]
        String s ="abcddcba";
        if (IntStream.range(0,s.length()/2).
        noneMatch(i->s.charAt(i)!=s.charAt(s.length()-i-1)))
            System.out.println("palindrome!");
        else
            System.out.println("not a palindrome!");
        /*//[reverse string]
        String s = "abcdcba";
        if (s.equals(new StringBuilder(s).reverse().toString()))
            System.out.println("palindrome!");
        else
            System.out.println("not a palindrome!");
         */

            //[recursivePalindrome]
            /*String s = "abcba";
            if (recursivePalindrome(s, 0, s.length() - 1))
                System.out.println("palindrome!");
            else
                System.out.println("not a palindrome");
             */
            //[while loop]
        /*String s = "racecar";
        int left = 0;
        int right = s.length() -1;
        while(left<right)
            if (s.charAt(left++)!=s.charAt(right--)){
         */
            //[for loop]
        /*
        String s = "abba";
        for(int i =0;i<s.length()/2;i++)
            if (s.charAt(i) != s.charAt(s.length()-1-i)){

                System.out.println("not a palindrome!");
                return;
            }
        System.out.println("palindrome!");

         */
        }
        /* //[recursive palindrome part]
    private static boolean recursivePalindrome(String text, int forward, int backward) {
        if (forward == backward)
            return true;
        if ((text.charAt(forward)) != (text.charAt(backward)))
            return false;
        if (forward < backward + 1)
            return recursivePalindrome(text, forward + 1, backward - 1);
        return true;
         */
}

