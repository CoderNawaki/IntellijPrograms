package com.Japan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//new Date-Time API help to cover not thread safe/Poor design/Difficult time zone handling
public class Java8DateTime { //new date-time api is immutable and doesnot have setter methods.
    public static void main(String[] args) {
        Java8DateTime java8DateTime = new Java8DateTime();
        java8DateTime.testLocalDateTime();
    }
    public void testLocalDateTime(){
        //get the current date and time
        LocalDateTime currentTime= LocalDateTime.now();
        System.out.println("Current DateTime:"+currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1:"+date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("Month:"+month+"day:"+"seconds:"+seconds);

        LocalDateTime date2= currentTime.withDayOfMonth(10).withYear(2020);
        System.out.println("date:"+date2);
        //February 2020
        LocalDate date3 = LocalDate.of(2020,Month.FEBRUARY,4);
        System.out.println("date3"+date3);

        //22 hour 15 min
        LocalTime date4 = LocalTime.of(22,15);
        System.out.println("date4:"+date4);
        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5:"+date5);
    }
}
