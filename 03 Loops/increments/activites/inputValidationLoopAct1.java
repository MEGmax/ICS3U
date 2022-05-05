package activites;

import java.util.Scanner;

public class inputValidationLoopAct1 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		
		//get users age
		System.out.println("Enter your age: ");
		age = keyboard.nextInt();
		
		//if age is less than 1, this code will run
		while (age < 1)
		{	
			System.out.println("That is not a vaild number, please enter a number greater than or equal to 1: ");
			age = keyboard.nextInt();
		}
		
		//if age is 1 or greater, this code will run
		System.out.println("You are " + age + " year(s) old");
	
		keyboard.close();
		
		
		

	}

}
