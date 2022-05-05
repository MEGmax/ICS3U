package lessons;
/*
 * Sometimes you want the user to determine the maximum value of the control variable in a for loop,
 * and therefore determine the number of times the loop iterates. Instead of displaying the numbers 1 
 * through 10 and their squares, this program allows the user to enter the maximum value to display.
 * This program demonstrates a user controlled for loop.
 */

import java.util.Scanner;
// This line imports the Scanner class

public class UserSquares
{
    public static void main(String[] args)
        {
            int number;
            //This line declares a variable named "number".
            // This variable will be used as the "Loop control variable"
            
            int maxValue;
            //This line will hold the maximum value to display entered by the user
            
            System.out.println("I will display a table of " +
                               "numbers and their squares.");
            // These lines print "I will display a table of numbers and their squares." to the user
            
            Scanner keyboard = new Scanner(System.in);
            // This line creates a Scanner object for keyboard input
            
            System.out.print("How high should I go? ");
            // This line asks the user to specify a maximum value.
            
            maxValue = keyboard.nextInt();
            // This line assigns user input to maxValue
            
            System.out.println("Number    Number Squared");
            System.out.println("------------------------");
            // These lines display the table header
            
            for (number = 1; number <= maxValue; number++)
            // The for loop's test expression uses the value in the "maxValue" variable
            // as the the upper limit for the control variable.
            {
                System.out.println(number + "\t\t" + number * number);
            }   
        }
}