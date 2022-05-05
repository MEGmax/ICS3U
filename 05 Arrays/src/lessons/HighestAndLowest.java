package lessons;
import java.util.Random;

//Finding the Highest and Lowest Values In a Numeric Array

//The algorithms for finding the highest and lowest values in an array are very similar.
//First, let s look at code for finding the highest value in an array.

public class HighestAndLowest
{

 public static void main(String[] args)
 {
     // Example 1: Finding the Highest Value in an Array
     System.out.println("Example 1: Finding the Highest Value in an Array");

     int[] numbers = new int[50];
     // This statement creates an array with a size declarator of 50 elements
     // referenced by a variable named "numbers".

     Random randomNumber = new Random();
     // This statement creates a new Random object named randomNumber.

     for (int i = 0; i < numbers.length; i++)
         // This loop iterates through the numbers array adding a random number from 1 to 500 to each element.
     {
         numbers[i] = randomNumber.nextInt(500) + 1;
     }

     int highest = numbers[0];
     // This statement assigns the value in the first array element to the variable "highest". 

     for (int i = 1; i < numbers.length; i++)
         // This loop iterates over the "numbers" array. 
     {
         if (numbers[i] > highest)
             // This statement compares all of the remaining array elements, beginning at subscript 1, to the value in highest.                  
         {
             highest = numbers[i];
             // This statement copies the highest value to "highest" each time it finds a value in the array that is greater than highest.   
         }
     }

     System.out.println("The highest value in the array is " + highest);
     // This statement prints the highest value found in the array.


     // Example 2: Finding the Lowest Value in an Array
     System.out.println("\nExample 2: Finding the Lowest Value in an Array");

     // The following code finds the lowest value in the array. As we can see,
     // it is nearly identical to the code for finding the highest value.

     int lowest = numbers[0];

     for (int i = 1; i < numbers.length; i++)
         // This loop iterates over the "numbers" array. 
     {
         if (numbers[i] < lowest)
             // This statement compares all of the remaining array elements, beginning at subscript 1, to the value in lowest.   
         {
             lowest = numbers[i];
             // This statement copies the lowest value to "lowest" each time it finds a value in the array that is less than lowest.
         }
     }

     System.out.println("The lowest value in the array is " + lowest);
     // This statement prints the lowest value found in the array.               

 }

}
