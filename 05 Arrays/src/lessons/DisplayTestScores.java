package lessons;
/*
 * As we have seen in a previous example, Java allows you to use an integer variable to specify an
 * array's "size declarator". This makes it possible to allow the user to specify an array's size.
 * This program demonstrates how the user may specify an array's size as well as the use of the
 * "length field".
 */

import java.util.Scanner; // Needed for Scanner class

public class DisplayTestScores
{
    public static void main(String[] args)
    {
        int numTests;     // The number of tests
        int[] tests;      // Array of test scores

        Scanner keyboard = new Scanner(System.in);
        // This line creates a Scanner object for user input.

        System.out.print("How many tests do you have? ");
        numTests = keyboard.nextInt();
        // This line gets the number of test scores from the user and parses the data into an integer.

        tests = new int[numTests];
        // This line creates an array named "tests" and sets the size determined by the user.

        for (int index = 0; index < tests.length; index++)
        {
            System.out.print("Enter test score " + (index + 1) + ": ");
            tests[index] = keyboard.nextInt();
            // This loop allows the user to enter the individual test scores.
        }

        System.out.println();
        System.out.println("Here are the scores you entered:");
        for (int index = 0; index < tests.length; index++)
            System.out.print(tests[index] + " ");
        // This loops iterates over the "tests" array and outputs the test scores.
        // Both loops use the "length member" to control their unique number of iterations.
    }
}
 