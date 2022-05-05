package activites;

import java.util.Scanner;

public class highestAndLowestAct {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
	
		int numberEntered1;
		int highestNumber;
		int lowestNumber = 0;
		
		System.out.println("This program will allow you enter as many numbers as you want \nand tell you the highest and lowest value. ");
		System.out.println("It will continue until -99 is entered.");
		
		System.out.println("Please enter a number: ");
		numberEntered1 = keyboard.nextInt();
	
		highestNumber = numberEntered1;
		lowestNumber = numberEntered1;

		while (numberEntered1 != -99)
		{
			
			
			if (numberEntered1 > highestNumber)
			{
				highestNumber = numberEntered1;
			}
			
			else
			{
				lowestNumber = numberEntered1;
			}
			
			System.out.println("Please enter a number: ");
			numberEntered1 = keyboard.nextInt();
		
			
			
		}
	
		System.out.println("The highest number is: " + highestNumber);
		System.out.println("The lowest number is: " + lowestNumber);
		
		

		keyboard.close();
	}

}
