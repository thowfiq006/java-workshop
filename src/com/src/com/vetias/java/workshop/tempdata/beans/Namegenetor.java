package com.vetias.java.workshop.tempdata.beans;

public class Namegenetor {
public int add(int a, int b)     
   {  
         return a + b;
    }
public int subtract(int a, int b)
   {
         return a - b;
    }
    public int multiply(int a, int b)
   {
         return a * b;
    }
    public int divide(int a, int b)
   {
         if (b != 0) {
             return a / b;
         } else {
             System.out.println("Division by zero error");
             return 0;
         }
    }
    public static void main(String[] args) {
        Namegenetor calc = new Namegenetor();
        System.out.println("Addition : " + calc.add(5, 10));
        System.out.println("Subtraction : " + calc.subtract(10, 5));
        System.out.println("Multiplication : " + calc.multiply(5, 10));
        System.out.println("Division : " + calc.divide(10, 5));
    }
    
}

    

