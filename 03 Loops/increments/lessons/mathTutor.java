package lessons;

/*
 * Random numbers are used in a variety of applications. Java
 * provides the Random class that you can use to generate random numbers.
 * 
 * The following program generates two random numbers and asks the user
 * for the answer to the sum of the numbers.
 */

import java.util.Scanner;   // Needed for the Scanner class
import java.util.Random;    // Needed for the Random class

public class mathTutor
{

        public static void main(String[] args)
        {
                int number1;        // A variable to hold  the 1st random number
                int number2;        // A variable to hold  the 2nd random number
                int sum;            // A variable to hold the sum of two numbers
                int userAnswer;     // A variable to hold the user's answer
                
                Scanner keyboard = new Scanner(System.in);
                // This line creates a Scanner object for keyboard input.
                
                Random randomNumbers = new Random();
                // This line creates a random object named "randomNumbers" from the Random class
                
                // Get two random numbers.
                number1 = randomNumbers.nextInt(100) + 1;
                // This line generates a random number between 1 and 100. The nextInt(100) method
                // actually generates a number from 0 to 99, however we want a number between 
                // 1 and 100. This is why we add 1 to the method. The variable "number1" will reference
                // the number generated.
                
                
                number2 = randomNumbers.nextInt(100) + 1;
                // This line also generates a random number between 1 and 100. The variable "number2" will
                // reference the number generated.
                // Note! Other data types may be used such as next.Double... next.Byte... next.Long... etc...
                
                // Display an addition problem.
                System.out.println("What is the answer to the following problem?");
                // This line prompts the user to answer the the addition question set by the random numbers.
                
                System.out.print(number1 + " + " + number2 + " = ? ");
                // This line prints the equation
                
                sum = number1 + number2;
                // This line calculates the answer and references the answer to the variable "sum"
                
                userAnswer = keyboard.nextInt();
                // This variable references the answer entered by the user
                
                // This conditional statement determines if the user entered the correct answer
                if (userAnswer == sum)
                {
                    System.out.println("Correct!");
                }   // end of if statement
                else
                {
                    System.out.println("Sorry, wrong answer. " + 
                                       "The correct answer is " +
                                       sum);
                }   // end of else statement


        }   // end of main method

}   // end of class
 
