package com.Japan;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8DateTimeZoned {
    public static void main(String[] args) {
        Java8DateTimeZoned java8DateTimeZoned= new Java8DateTimeZoned();
        java8DateTimeZoned.testZonedDateTime();

    }
    public void testZonedDateTime(){
        //get the current date and time
        ZonedDateTime date1 =ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1:"+date1);

        ZoneId id = ZoneId.of("Asia/Tokyo");
        System.out.println("ZoneId:"+id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone:"+currentZone);
    }
}
