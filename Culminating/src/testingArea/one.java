package testingArea;

import java.util.Scanner;
import java.util.Random;


public class one {

	public static void main(String[] args) 
	{
	
		Scanner k = new Scanner (System.in);
		Random randomNumber = new Random();
		
		int input;
		int answer;
		int guesses = 10;
		
		answer = randomNumber.nextInt(20) +1;
		
		System.out.println("The comopputer as guessed a number from 1 to 20");
		System.out.println("you have 10 guess left");
		System.out.println();
		System.out.print("Guess a number: ");
		
		input = k.nextInt();
		
		guesses --;
		
		while (input != answer && guesses > 0)
		{
			if (input < answer )
			{
				System.out.print("Your guess is too low you have " + guesses + " guesses remaining, try again ");
			}
			else if (input > answer)
			{
				System.out.print("Your guess is too high you have " + guesses + " guesses remaining, try again ");
			}
			
			input = k.nextInt();
			guesses--;
			
		}
		System.out.println();
		
		if (input == answer)
		{
			System.out.println("You guessed correctly! ");
			System.out.println("It took you " + (10- guesses) + "guesses");
		}
		
		if (guesses == 0)
		{
			System.out.println("you have failed to guess the number.");
		}
		
		k.close();
		
		

	}

}
