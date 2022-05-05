package lessons;
/*
 * The program below is a program that a teacher might use to get the average of each student's test scores.
 * In line 22 the user enters the number of students, and in line 26 the user enters the number of test stores
 * per student. The for loop that begins in line 29 iterates once for each student. The nested inner for loop,
 * in lines 16 through 41, iterates once for each test score.
 */

import java.util.Scanner;

public class testAverage2Lesson
{
   public static void main(String [] args)
   {
      int numStudents,
      // This line declares an integer variable to hold the number of students
      
          numTests,
          // This line declares an integer variable to hold the number of tests per student
          
          score,
          // This line declares an integer variable to hold the score
          
          total;
          // This line declares an integer variable that is used as an "Accumulator" for test scores
      
      double average;
      // This line declares a double variable to hold the average test score

      Scanner keyboard = new Scanner(System.in);
      // This line create a Scanner object for keyboard input.      

      System.out.print("How many students do you have? ");
      // This line prompts the user to enter the number of students
      
      numStudents = keyboard.nextInt();
      // This line holds the value entered by the user into the "numStudents" variable 

      System.out.print("How many test scores per student? ");
      // This line prompts the user to enter the number of test scores per student.
      
      numTests = keyboard.nextInt();
      // This line holds the value entered by the user into the "numTests" variable 

      // Process all the students.
      for (int student = 1; student <= numStudents; student++)
          // This loop iterates once for each student
      {
         total = 0;
         // This line sets the accumulator to zero

         System.out.println("Student number " + student);
         // This line prompts the user with the student in the list
         
         System.out.println("--------------------");
         // This line prints a dashed line to distinguish the separation
         // of each student
         
         for (int test = 1; test <= numTests; test++)
             // This loop iterates once for each test score that is imputed by the user.
         {
            System.out.print("Enter score " + test + ": ");
            // This line prompts the user for the value of the test
            
            score = keyboard.nextInt();
            // This line stores the value to the "score" variable
            
            total += score;
            // This line add each value entered to the previous value
         }

         // Calculate and display the average.
         average = total / numTests;
         // This line calculates the average after the inner loop finishes iterating
         
         System.out.printf("The average for student %d is %.1f.\n\n", student, average);
         // This line prints the students and their average
         
      } // End of main loop
   
   }    //End of main
   
}   //End of class

/*
 * A few points about nested loops:
 * 
 * 1. An inner loop goes through all of its iterations for each iteration of an outer loop.
 * 
 * 2. Inner loops complete their iterations before outer loops do.
 * 
 * 3. To get the total number of iterations of a nested loop, multiply the number of iterations of all the loops.
 */
 