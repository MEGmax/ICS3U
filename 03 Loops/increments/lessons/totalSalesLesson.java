package lessons;
/*
 * 
 * Many programming tasks require you to calculate the total of a series of numbers.
 * For example, suppose you are writing a program that calculates a businesses total
 * sales for a week. The program would read the sales for each day as input and calculate
 * the total of those numbers. Programs that calculate the total of a series of numbers
 * typically use two elements:
 * 
 * 1. A loop that reads each number in the series.
 * 2. A variable that accumulates the total of the numbers as they are read.
 * 
 * The variable used to accumulate the total of the numbers is called an "accumulator".
 * It is often said that the loop keeps a running total because it accumulates the total
 * as it reads each number in the series. The program below shows the general logic of a
 * loop that calculates a running total.
 */

import java.util.Scanner;

public class totalSalesLesson
{
        public static void main(String[] args)
        {
                int days;           // The number of days
                double sales;       // A day's sales figure
                double totalSales;  // Accumulator
                
                Scanner userInput = new Scanner(System.in);
                
                // Get the number of days from the user
                System.out.println("For how many days do you sales figures? ");
                // These lines ask the user to enter the number of days for which he or she has sales figures.

                days = userInput.nextInt();
                // This line reads the number from the input dialog box and assigns it to the "days" variable.
                
                totalSales = 0.0;
                // This line assigns 0.0 to the totalSales variable. In general programming terms, the totalSales
                // variable is referred to as an accumulator. An accumulator is a variable that is initialized with
                // a starting value, which is usually zero, and then accumulates a sum of numbers by having the
                // numbers added to it.
                
                for (int count = 1; count <= days; count++)
                // This line iterates as many times specified by the user. During each iteration of the loop, the
                // user enters the amount of sales for a specific day.
                {
                    System.out.println("Enter the sales for day" + count + ": ");
                    // This line asks the user to enter the sales for the day.
                    
                    sales = userInput.nextInt();
                    // This line assigns the sales for the day to the "sales" variable.
                    
                    totalSales += sales;
                    // This line adds the contents of sales to the existing value in the totalSales variable.
                    // Note that it does not assign sales to totalSales, but adds sales to totalSales. Put another way,
                    // this line increases totalSales by the amount in sales.
                }
                                
                System.out.printf("The total sales are: $%.2f ", totalSales);
                // This line will display the total of all the daily sales figures entered, after the loop has finished. 
        }
}
 