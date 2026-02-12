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

        // attempting to add floating point number 1
        System.out.print("Enter your first number: \n~ ");
        float number1 = scanner.nextFloat();

        // attempting to add floating point number 2
        System.out.print("Enter your first number: \n~ ");
        float number2 = scanner.nextFloat();

        /* This was original calculator for int variables

        // asks and stores first number
        System.out.print("Enter the first whole number: \n~ ");
        int num1 = scanner.nextInt();

        // asks and stores second number
        System.out.print("Enter the second whole number: \n~ ");
        int num2 = scanner.nextInt();
        */

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
        float result;

        // if-else to decide operation
        if(choice.equals("add")){
            // addition operation
            result = number1 + number2;
            System.out.println("Sum: " + result);

        }   else if(choice.equals("sub")){
            // subtraction operation
            result = number1 - number2;
            System.out.println("Difference: " + result);

        }   else if(choice.equals("multi")){
            // multiplication operation
            result = number1 * number2;
            System.out.println("Product: " + result);

        }   else if(choice.equals("div")){
            // division operation
            result = number1 / number2;
            System.out.println("Quotient: " + result);

        }   else{
            // added line for unexpected user inputs
            System.out.println("Error: input unknown");

        }

        scanner.close();
    }
    
}
