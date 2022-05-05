package activites;

import java.util.Scanner;

public class switchStatementAct1 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter a number between 1 and 3 to display the word version of the number: ");
		number = keyboard.nextInt();
		
		switch (number)
		{
		case 1:
			System.out.println("You entered number one");
			break;
			
		case 2:
			System.out.println("You entered number two");
			break;
			
		case 3:
			System.out.println("You entered number three");
			break;
			
		default:
			System.out.println("You must enter a number between 1 and 3 ");
		}
			

	}

}
