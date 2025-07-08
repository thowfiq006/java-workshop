package com.vetias.java.workshop.tempdata.beans;
import java.util.Scanner;
    public class AgeCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your year of birth:");
            int yearOfBirth = scanner.nextInt();
            int currentYear = 2025;
            int age = currentYear - yearOfBirth;
            System.out.println("Age: " + age);
        }
 }