package lessons;
import java.util.Random;

//Getting the Average of Values in a Numeric Array

//The first step in calculating the average of all the values in an array is to
//sum the values. The second step is to divide the sum by the number of elements
//in the array. See the following code.

public class GettingTheAverage
{
  public static void main(String[] args)
  {
      
      double total = 0;
      // This statement creates an "double" accumulator variable to hold the running total of the elements
      // in the array.

      double average;
      // This statement creates a "double" variable named "average". It will hold the average
      // of the elements found in the array.
      
      double[] scores = new double[10];
      // This statement creates a "double" array with a size declarator of 10 elements
      // referenced by a variable named "scores".

      Random randomNumber = new Random();
      // This statement creates a new Random object named randomNumber.

      for (int i = 0; i < scores.length; i++)
          // This loop iterates through the scores array adding a random number from 1 to 100 to each element.
      {
          scores[i] = randomNumber.nextInt(100) + 1;
      }

      System.out.print("The elements in the array are ");

      for (int i = 0; i < scores.length; i++)
          // This loop iterates through the scores array
      {
          System.out.print(" "+ scores[i]);
          // This statement displays the elements in the scores array
      }

      for (int index = 0; index < scores.length; index++)
          // This loop iterates over the "scores" array
      {
          total += scores[index];
          // This statement will sum each element in the array with every iteration.
      }

      average = total / scores.length;
      // This statement finds the average of the elements in the array once the loop finishes.

      System.out.println("\nThe average of the values in the array is " + average);
      // This statement prints the average.

  }

}