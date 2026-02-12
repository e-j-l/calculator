//======================================
// Calculator Class 
// Emmett Leary
// Assignment 3 
// February 10, 2026
//======================================

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // asks and stores first number
        System.out.print("Enter the first whole number: \n~ ");
        int num1 = scanner.nextInt();

        // asks and stores second number
        System.out.print("Enter the second whole number: \n~ ");
        int num2 = scanner.nextInt();

        // Ask the user to choose addition, subtraction, multiplication and division 
        System.out.print("Type one of the following: \n" +
                         "-------------------------- \n"+
                         "'add' for addition \n"+
                         "'sub' for subtraction \n"+
                         "'multi' for multiplication \n"+
                         "'div' for division \n"+
                         "-------------------------- \n~ ");
        String choice = scanner.next();

        // creates a place to store the result
        int result;

        // if-else to decide operation
        if(choice.equals("add")){
            // addition operation
            result = num1 + num2;
            System.out.println("Result: " + result);

        }   else if(choice.equals("sub")){
            // subtraction operation
            result = num1 - num2;
            System.out.println("Result: " + result);

        }   else if(choice.equals("multi")){
            // multiplication operation
            result = num1 * num2;
            System.out.println("Result: " + result);

        }   else if(choice.equals("div")){
            // division operation
            result = num1 / num2;
            System.out.println("Result: " + result);

        }   else{
            // added line for unexpected user inputs
            System.out.println("Error: not an operation option");

        }

        scanner.close();
    }
    
}
