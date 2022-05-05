package lessons;

/*
 * Nested loops are necessary when a task performs a repetitive operation and that task itself must he repeated. A clock is
 * a good example of something that works like a nested loop. The program below uses nested loops to simulate a clock.
 */

public class clockLesson
{
   public static void main(String[] args)
   {
      // Simulate the clock.
      for (int hours = 1; hours <= 12; hours++)
      {
          // When this outermost loop has iterated 12 times,
          // the middle loop will have iterated 720 times and
          // the innermost loop will have iterated 43,200 times.

          for (int minutes = 0; minutes <= 59; minutes++)
          {
              // This middle loop will iterate 60 times for
              // each single iteration of the outermost loop.

             for (int seconds = 0; seconds <= 59; seconds++)
             {
                // This loop will iterate 60 times for
                // each single iteration of the middle loop,
                System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds); 
             }  // end of third inner loop

          } // end of second inner loop

       }    // end of outer loop

   }    // end of main

}   // end of class