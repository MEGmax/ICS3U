package activites;

import java.util.Scanner;

public class switchStatmentAct2 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String input;
		char letter;
		
		System.out.println("Select a letter from the list: " + "A, B, C, D");
		
		input = keyboard.nextLine();
		letter = input.charAt(0);
		
		
		switch(letter)
		
		{
		case 'a':
		case 'A':
			System.out.println("You entered the letter A");
			break;
			
		case 'b':
		case 'B':
			System.out.println("You entered the letter B");
			break;
			
		case 'c':
		case 'C':
			System.out.println("You entered the letter C");
			break;
			
		case 'd':
		case 'D':
			System.out.println("You entered the letter D");
			break;
	
		default:
			System.out.println("Not good with letters eh?");
		}
		
		keyboard.close();
	}

}
