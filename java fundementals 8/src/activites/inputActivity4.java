package activites;

import java.util.Scanner;

public class inputActivity4 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		
		double test1;
		double test2;
		double test3;
		double average;
		
		//get users first test score
		System.out.print("What was your first test score? ");
		test1 = keyboard.nextDouble();
		
		//get users second test score
		System.out.print("What was your second test score? ");
		test2 = keyboard.nextDouble();
		
		//get users third test score
		System.out.print("What was your third test score? ");
		test3 = keyboard.nextDouble();
		
		//calcuate average of test
		average = (test1 + test2 + test3) / 3;
		
		//display data to user
		System.out.println("You scored a " + test1 + " on your first test");
		System.out.println("You scored a " + test2 + " on your second test");
		System.out.println("You scored a " + test3 + " on your third test");
		System.out.print("This makes your average test score : " + average);

		keyboard.close();

		
		
		
		
		
		
		
	}

}
