package lessons;
/*
 * One interesting way to learn about nested loops is to use them to display patterns on the screen.
 * Suppose we want to print asterisks on the screen in the following rectangular pattern:
 
 ******
 ******
 ******
 ******
 ******
 ******
 ******
 ******
 
 * If you think of this pattern as having rows and columns, you can see that it has eight rows, and each
 * row has six columns. The following code can be used to display such a pattern.
 */



// The program below displays a rectangular pattern of asterisks based on columns and rows entered by the user

import java.util.Scanner;

public class rectangularPatternLesson
{
   public static void main(String[] args)
   {
      int rows, cols;
      // This line declares two integer variable named "rows" and "cols"
      
      Scanner keyboard = new Scanner(System.in);
      // This line creates a Scanner object named "keyboard" for user input
      
      System.out.print("How many rows? ");
      // This line asks the user to enter the amount of rows to be displayed
      // for the rectangle pattern
      
      rows = keyboard.nextInt();
      // This line stores the rows value entered by the user into the variable "rows"
      
      System.out.print("How many columns? ");
      // This line asks the user to enter the amount of columns to be displayed
      // for the rectangle pattern
      
      cols = keyboard.nextInt();
      // This line stores the columns value entered by the user into the variable "cols"
   
      for (int r = 0; r < rows; r++)
      // This outer loop iterates as many times entered by the user. For example, lets assume the user
      // enters a value of 8 for the rows and a value of 6 for the columns. This means that the inner
      // loop would iterate 6 times times for every iteration done for the outer loop. 
      
      {
         for (int c = 0; c < cols; c++)
         // This loop iterates 6 times for every 1 iteration done by the outer loop... Assuming
         // the user entered 8 for rows and 6 for columns
         {
           System.out.print("*");
           // This line prints an asterisk on the screen during every iteration.
         }  // End of inner for loop
         
         System.out.println();
         // This line advances the cursor to a new line after each row has been printed by calling the
         // System.out.println() method. Without this statement, all the asterisks will be printed in
         // one long row on the screen.
      } // End of outer for loop
      
   }    // End of main
   
}   // End of class     