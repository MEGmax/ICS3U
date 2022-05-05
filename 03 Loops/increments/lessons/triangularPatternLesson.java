package lessons;

import java.util.Scanner;

//This program displays a triangle pattern.

public class triangularPatternLesson
{
public static void main(String[] args)
{
   final int BASE_SIZE = 8;
   
   for (int r = 0; r < BASE_SIZE; r++)
   // This outer loop will iterate eight times. As the loop iterates, the variable r will be assigned the values 0 through 7
   {
      for (int c = 0; c < (r+1); c++)
      // For each iteration of the outer loop, this inner loop will iterate r + 1 times. Therefore...
      // During the outer loop's first iteration, the variable r is assigned 0. The inner loop iterates
      // one time, printing one asterisk.
      // During the outer loop's second iteration, the variable r is assigned 1. The inner loop iterates
      // two times, printing two asterisks.
      // During the outer loop's third iteration, the variable r is assigned 2. The inner loop iterates
      // three times, printing three asterisks.
      // ... and so forth
      {
         System.out.print("*");
         // This line prints one asterisk for every iteration performed by the inner loop
      }  // end of inner for loop
      System.out.println();
      // This line advances the cursor to the beginning of a new line when the inner circle completes all its iterations

   } // end of outer for loop

}    // end of main method

}   // end of of class
