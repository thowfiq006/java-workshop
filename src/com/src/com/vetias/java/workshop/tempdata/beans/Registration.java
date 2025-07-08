package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalTime;

public class Registration {
public static void main(String[] args) {
    LocalTime currentYear = LocalTime.now();
    LocalTime registrationTime = LocalTime.of(18,59,59);
    int hrs = registrationTime.getHour();
    int min = registrationTime.getMinute();    
    int sec = registrationTime.getSecond();
    System.out.println("Registration Time: " + hrs + ":" + min + ":" + sec--);
}         

}