package lessons;
/*
You can read values from the keyboard and store them
in an array element just as you can a regular variable..

The program below shows an array being used to store and
display values entered by the user.
 */

import java.util.Scanner; // Needed for Scanner class

public class ArrayDemo1
{
    public static void main(String[] args)
    {
        final int EMPLOYEES = 3;
        // This line declares a final integer variable called EMPLOYEES and
        // initializes it with a value of 3

        int[] hours = new int[EMPLOYEES];
        // This line creates a new array named "hours" and assigns a "size
        // declarator" of EMPLOYEES.

        Scanner keyboard = new Scanner(System.in);
        // This line creates a Scanner object for keyboard input.

        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");
        // These lines asks the user to enter the hours worked for 3 employees.

        System.out.print("Employee 1: ");
        hours[0] = keyboard.nextInt();
        // This line gets the hours worked by employee 1 and
        // stores it in "hours sub 0"

        System.out.print("Employee 2: ");
        hours[1] = keyboard.nextInt();
        // This line gets the hours worked by employee 2 and
        // stores it in "hours sub 1"

        System.out.print("Employee 3: ");
        hours[2] = keyboard.nextInt();
        // This line gets the hours worked by employee 3 and
        // stores it in "hours sub 2"

        // These lines of code display the values entered.
        System.out.println("\nThe hours you entered are:");
        System.out.println(hours[0]);
        System.out.println(hours[1]);
        System.out.println(hours[2]);
    }
}
 