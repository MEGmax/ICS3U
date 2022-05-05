package activites;

import java.util.Scanner;

public class inputValidationLoopAct2 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		
		//ask user for new password
		System.out.println("Please set a new password: ");
		String password = keyboard.nextLine();
		
		//ask user for correct password
		System.out.println("What is the currently stored password: ");
		String passwordEntered = keyboard.nextLine();
		
		//if the user gets the password wrong, this code will run
		while (!(password.equals(passwordEntered)))
		{
			System.out.println("Incorrect! Please try again: ");
			passwordEntered = keyboard.nextLine();
		}
		
		//if the user gets the password correct, this code will run
		System.out.println("Correct! " + password + " is the correct password1");
		
		keyboard.close();
	}

}
