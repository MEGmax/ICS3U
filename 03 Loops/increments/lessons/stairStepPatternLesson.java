package lessons;
import java.util.Scanner;

//This program displays a stairstep pattern.

public class stairStepPatternLesson
{
public static void main(String[] args)
{
   final int NUM_STEPS = 6;
   
   for (int r = 0; r < NUM_STEPS; r++)
   // This outer loop will iterate six times. As the loop iterates, the variable r
   // will be assigned the values 0 through 5.
   {
      for (int c = 0; c < r; c++)
      // For each iteration of the outer loop, this inner loop will iterate r times. Therefore,
      // During the outer loop's first iteration, the variable r is assigned 0. The inner loop will not execute at this time.
      // During the outer loop s second iteration, the variable r is assigned 1. The inner loop iterates one time,
      // printing one space.
      // During the outer loop's third iteration, the variable r is assigned 2. The inner loop iterates two times
      // printing two spaces
      // ... and so forth
      {
         System.out.print(" ");
         // This line prints a space during every iteration
      }
      System.out.println("#");
      // This line prints a hash tag for every iteration of the outer loop and after all the iterations of the inner loop
   }
}
}
