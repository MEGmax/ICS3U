package activites;

import java.util.Scanner;

public class whileLoopChallenge {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		
		//number user enters
		int max;
		
		//sum will be final answer, initialized to start
		int sum = 0;
		
		//will be used to add to the number entered by the user, starting at 0 since ++ will add one to 0 making it add by one
		int counter = 0;
		
		//explain to user what code does
		System.out.println("This program will add all integers from 1 to the number you enter!");
		
		//ask user for number
		System.out.println("Please enter a positive, non-zero integer: ");
		max = keyboard.nextInt();
		
		//only run code if the number the user entered is a positive non-zero integer
		if (max > 0)
		{
			//will run code until the number the user entered is reached
			while (counter <= max)
				{
				//value for sum
				sum = counter + sum;
				//increases value for counter
				counter ++;
				}
			
			//shows sum
			System.out.println("The sum of the number 1 to " + max + " is " + sum);
		}
		
		//runs if user failed to enter positive non zero integer
		else 
			System.out.println("Sorry! The number you entered is not a positive non zero integer");
		
		
		keyboard.close();

	}

}
