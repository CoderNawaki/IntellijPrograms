package com.Japan;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class BackCompatibility {
    public static void main(String[] args) {
        BackCompatibility backCompatibility = new BackCompatibility();
        backCompatibility.testBackwardCompatibility();

    }
    public void testBackwardCompatibility(){
        //get the current date
        Date currentDate = new Date();
        System.out.println("Current date:"+currentDate);
        //get the instant of current date in terms of milliseconds
        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now,currentZone);
        System.out.println("Local date:"+localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now,currentZone);
        System.out.println("Zoned date:"+zonedDateTime);
    }
}
