package com.vetias.java.workshop.tempdata.beans;
import java.time.LocalDate;
import java.util.Scanner;
    public class AgeCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your year of birth:");
            int yearOfBirth = scanner.nextInt();
            int currentYear = 2025;
            int age = currentYear - yearOfBirth;
            System.out.println("Age: " + age);

            System.out.println("Enter your month of birth (1-12):");
            String monthOfBirth = scanner.next();
            LocalDate birthDate = LocalDate.parse(dateOfBirth);
            int extractedYearOfBirth = birthDate.getYear();
            int extractedMonthOfBirth = birthDate.getMonthValue();
            System.out.println("Enter your day of birth (1-31):"); 
        }
 }