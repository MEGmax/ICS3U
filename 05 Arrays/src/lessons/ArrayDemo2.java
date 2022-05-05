package lessons;
/*
 * Subscript numbers can be stored in variables. This makes it possible to use a loop to "cycle through" an entire array,
 * performing the same operation on each element. For example, the code in the previous example (ArrayDemo1) could be
 * simplified by using two "for" loops: one for inputting the values into the array and the other for displaying the
 * contents of the array. See the program below:
 */

import java.util.Scanner; // Needed for Scanner class

public class ArrayDemo2
{
    public static void main(String[] args)
    {
        final int EMPLOYEES = 3;
        // This line specifies the number of employees

        int[] hours = new int[EMPLOYEES];
        // // This line creates a new array named "hours" and assigns a "size
        // declarator" of EMPLOYEES.

        Scanner keyboard = new Scanner(System.in);
        // This line creates a Scanner object for keyboard input.

        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");
        // These lines asks the user to enter the hours worked for 3 employees.

        // Get the hours for each employee.
        for (int index = 0; index < EMPLOYEES; index++)
        {
            System.out.print("Employee " + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
            // The variable index starts at 0. During the loop's first iteration, the user's input is stored in hours[0].
            // Then, index is incremented, so its value becomes 1. During the next iteration, the user's input is stored
            // in hours[1]. This continues until values have been stored in all of the elements of the array.
        }

        System.out.println("\nThe hours you entered are:");

        // Display the values entered.
        for (int index = 0; index < EMPLOYEES; index++)
        {
            System.out.println(hours[index]);
        }

        // This code shows an alternate method for displaying the contents of an array
        // for (int element : hours)
        // {
        //      System.out.println(element);
        // }

    }
}

// NOTE! Java performs array "bounds checking", which means that it does not
// allow a statement to use a subscript that is outside the range of valid subscripts for an array.
 