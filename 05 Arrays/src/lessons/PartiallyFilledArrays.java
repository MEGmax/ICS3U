package lessons;
import java.util.Scanner;

/*
 * Sometimes you need to store a series of items in an array, but you do not know the number of items there are.
 * As a result, you do not know the exact number of elements needed for the array. One solution is to make the array
 * large enough to hold the largest possible number of items. This can lead to another problem, however. If the actual
 * number of items stored in the array is less than the number of elements, the array will be only partially filled.
 * When you process a partially filled array, you must process only the elements that contain valid data items.
 * A partially filled array is normally used with an accompanying integer variable that holds the number of items stored
 * in the array. For example, suppose a program uses the following code to create an array with 100 elements and an
 * int variable named count, which will hold the number of items stored in the array:
 * 
 */

public class PartiallyFilledArrays
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 100;
        // This line declares and initializes a final integer variable named ARRAY_SIZE.
                
        int[] input = new int[ARRAY_SIZE];
        // This line creates an array with a size declarator of 100
                
        int count = 0;
        // This line declares and initializes a variable named "count" that will be used
        // to determine the maximum array subscript to use.
                
        Scanner keyboard = new Scanner(System.in);
        // This line creates a Scanner class for user input
        
        System.out.print("Enter a number or -1 to quit: ");
        // This line prompts the user to enter a number or to enter -1 to quit
                
        int number = keyboard.nextInt();
        // This line passes the value entered by the user to "number"
                
        while (number != -1 && count < input.length)
        // This while loop will iterate as long as "number" does not equal 0 and count is less than
        // the length of the input array
        {
            input[count] = number;
            // This line writes the number entered by the user into an element of the input array
            
            count++;
            // This line increments "count" by a value of 1 after every iteration.
                    
            System.out.print("Enter a number or -1 to quit: ");
            // This line prompts the user to enter a number or to enter -1 to quit during every iteration
                    
            number = keyboard.nextInt();
            // This line passes the value entered by the user to "number" during every iteration
        }
                
        System.out.print("The elements in the array are: ");
        
        for (int i = 0; i < count; i++)
        // This loop iterates over the input array as many times specifies by the count variable.
        {
            System.out.print(" " + input[i]);
            // This line prints the contents of the array.      
        }
                
        System.out.println("\nYou entered " + count + " elements into the input array.");
        // This line print out how many elements were entered by the user
    }
}