package activites;

import java.util.Scanner;

public class runningTotalAndSentinelValuesActivity1 {

	public static void main(String[] args) 
	{
		int count;
		int sum = 0;
		int numberEntered;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("This program will add the next 7 numbers you enter.");
		for (count= 1; count <=7; count++ )
		{
			System.out.println("Please enter a number: ");
			numberEntered = keyboard.nextInt();
			
			sum += numberEntered;

		}
		
		System.out.println("The sum of these seven numbers are " + sum);
		
		keyboard.close();
		
		/*
		 * Question 2:
		 * The x variable is the control variable and the y variable is the accumulator
		 * 
		 * Question 3:
		 * It is important to be careful when choosing a sentinel value since this value dictates how many times a loop will run. Having an improper sentinel value
		 * could cause the loop to run an infinite amount of times, not enough times, or at all. 
		 */
		
		
	}

}
