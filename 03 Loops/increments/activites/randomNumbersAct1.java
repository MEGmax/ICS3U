package activites;

import java.util.Random;

public class randomNumbersAct1 {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		double x = rand.nextDouble();
		System.out.println(x);
		
		/*
		 * Question 1:
		 * The following statement:
		 * x = rand.nextInt();
		 * will retrieve a random number that has no range, so the number could be negative positive or 0 with any value (that is an integer)
		 * and stores it in the variable x 
		 * 
		 * Question 2:
		 * The following statement:
		 * x = rand.nextlnt(100);
		 * will retrieve a random number (that is an integer) from 0 to 99 and store it in the variable x
		 * 
		 * Question 3:
		 * The following statement:
		 * x = rand.nextInt(9) + 1;
		 * will retrieve a random number (that is an integer) from 1-9 and store it in the variable x
		 * 
		 * Question 4:
		 * The following statement:
		 * x = rand.nextDouble(); 
		 * will retrieve a random number from 0-1 and store it the variable x. The value will most likely be a decimal unless it is 0 or 1. 
		 */
		
		
		

	}

}
