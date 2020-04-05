package com.Japan;

import java.text.Normalizer;
import java.util.Formatter;

public class JS {
    public static void main(String[] args) {
        try{
            Formatter f = new Formatter("c:¥java¥¥sample.js");
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
