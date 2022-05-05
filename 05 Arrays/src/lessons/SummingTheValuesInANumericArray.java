package lessons;
import java.util.Random;

//Summing the Values of an Array

//To sum the values in an array you must use a loop with an "accumulator" variable.
//The loop adds the value in each array element to the accumulator.

public class SummingTheValuesInANumericArray
{
  public static void main(String[] args)
  {

      int[] units = new int[25];
      // This statement creates an array with a size declarator of 25 elements
      // referenced by a variable named "units".

      Random randomNumber = new Random();
      // This statement creates a new Random object named randomNumber.

      for (int i = 0; i < units.length; i++)
          // This loop iterates through the units array adding a random number from 1 to 50 to each element.
      {
          units[i] = randomNumber.nextInt(50) + 1;
      }

      System.out.print("The elements in the array are");

      for (int i = 0; i < units.length; i++)
          // This loop iterates through the units array
      {
          System.out.print(" "+ units[i]);
          // This statement displays the elements in the units array
      }

      int total = 0;
      // This statement declares and initializes an integer variable that will be
      // used as the accumulator.

      for (int i = 0; i < units.length; i++)
          // This loop adds the values of each element of the units array to the total variable.
          // When the code is finished, total will contain the sum of all of the units array's elements.
      {
          total += units[i];
      }
      System.out.println("\nThe sum of the elements in the array is " + total);
      // This statement prints the sum of the elements.
  }
}