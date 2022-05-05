package lessons;

import java.util.Scanner; // Needed for Scanner class

//This program demonstrates the use of array elements in a simple mathematical statement. A loop steps
//through each element of the array, using the elements to calculate the gross pay of five employees
//who all make the same wage.

public class PayArray
{
 public static void main(String[] args)
 {
     final int EMPLOYEES = 5;   // Number of employees
     double payRate;            // Hourly pay rate
     double grossPay;           // Gross pay

     int[] hours = new int[EMPLOYEES];
     // This line creates an array to hold employee hours.

     Scanner keyboard = new Scanner(System.in);
     // This lines creates a Scanner object for user input.

     System.out.println("Enter the hours worked by " + EMPLOYEES + " employees who all earn the same hourly rate.");
     // This line asks the user to enter the hours worked by each employee.

     for (int index = 0; index < EMPLOYEES; index++)
     {
         System.out.print( "Employee #" + (index + 1) + ": ");
         hours[index] = keyboard.nextInt();
         // This loop allows the user to enter a value for each element in the hours array.
     }

     System.out.print("\nEnter the hourly pay rate for each employee: ");
     payRate = keyboard.nextDouble();
     // This line asks the user to enter the hourly pay rate for each employee and stores the value into "payRate".


     System.out.println( "\nHere is each employee's gross pay:");
     for (int index = 0; index < EMPLOYEES; index++)
     {
         grossPay = hours[index] * payRate;
         // This line assigns the value of hours[index] times payRate to the grossPay variable:

         System.out.printf("Employee #%d: $%.2f\n", (index + 1), grossPay);
         // This loops displays each employee's gross pay.
     }
 }
}
