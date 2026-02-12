// Calculator Class 
// Emmett Leary
// Assignment 3 
// February 10, 2026

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // asks and stores first number
        System.out.print("Enter the first whole number: ");
        int num1 = scanner.nextInt();

        // asks and stores second number
        System.out.print("Enter the second whole number: ");
        int num2 = scanner.nextInt();

        // Ask the user to choose addition or subtraction 
        System.out.print("Type 'add' for addition or 'sub' for subtraction: ");
        String addsub = scanner.next();

        // creates a place to store the result
        int result;

        // if-else to decide operation
        if(addsub.equals("add")){
            // addition operation
            result = num1 + num2;
            System.out.println("Result: " + result);

        }   else{
            // subtraction operation
            result = num1 - num2;
            System.out.println("Result: " + result);

        }

        scanner.close();
    }
    
}
