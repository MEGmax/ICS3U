package activites;

import java.util.Random;

public class randomNumbersAct2 {

	public static void main(String[] args) 
	{
		Random rN = new Random();
		
		int computer = 0;
		int user = 0;
		int computerWins = 0;
		int userWins = 0;
		int counter = 1 ;
		
		while (counter <= 6)
		{
			computer= rN.nextInt(6) + 1;
			user = rN.nextInt(6) + 1;
			counter ++;

				if (computer > user)
				{
					System.out.println("The computer rolled a " + computer + " and the user rolled a " + user);
					System.out.println("Computer wins!");
					computerWins++;
				}
				
				else if (user > computer)
				{
					System.out.println("The computer rolled a " + computer + " and the user rolled a " + user);
					System.out.println("User wins!");
					userWins++;
				}
				
				else 
				{
					System.out.println("The computer rolled a " + computer + " and the user rolled a " + user);
					System.out.println("Tie!");
				}
		}
		
		if (userWins > computerWins)
		{
			System.out.println("The user is the grand winner!");
		}
		
		else if (userWins < computerWins)
		{
			System.out.println("The computer is the grand winner!");
		}
		
		else 
		{
			System.out.println("The computer and user have tied in total wins.");
		}
		

		
		
		
		
		
	}

}
