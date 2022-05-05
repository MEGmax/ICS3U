package activites;

import java.util.Scanner;

public class stringComparisonAct2 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String input;
		
		System.out.println("Enter a single character: ");
		input = keyboard.nextLine();
		
		
		if (input.length() == 1)
		{
		
			if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i") 
				|| input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u"))
			{
				System.out.println("The letter " + input + " is a vowel");
			}
	
			else
			{
				System.out.println("The letter " + input + " is a constant");
			}
			
			
		}
		else 
		{
			System.out.println("That is not a single character. Please try again");
		}

		keyboard.close();
	}
		
}
