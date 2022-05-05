package activites;

import java.util.Scanner;

public class inputAcivity3 

{
	public static void main(String[] args) 
	
	{
		Scanner keyboard = new Scanner (System.in);
		
		double milesDriven;
		double gasUsed;
		double mpg;
		
		//get number of miles
		System.out.print("How many miles have you driven? ");
		milesDriven = keyboard.nextDouble();
		
		//get gas used
		System.out.print("How many gallons of gas have you used? ");
		gasUsed = keyboard.nextDouble();
		
		//calculate mpg
		mpg = milesDriven / gasUsed;
		
		//display data to user
		System.out.print("You have driven " + milesDriven + " miles and have used " + gasUsed + " gallons of gas making your miles per gallon (MPG) " + mpg);
		
		keyboard.close();

		
		

	}

}
