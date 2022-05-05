package activites;

import java.util.Scanner;

public class PaintJobEstimator {

	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		
		//get number of rooms
		System.out.print("Please enter the number of rooms you wish to paint: ");
		int rooms = k.nextInt();
		
		//get price per gallon
		System.out.print("Please enter the price of paint per gallon: $");
		double pricePer = k.nextDouble();
		
		//array for room size of each room
		int[] roomSize = new int[rooms];
		
		//inializes total square feet
		double totalSqfeet = 0;
		
		//runs once for every room 
		for (int index = 0; index < rooms; index++)
		{
			//gets square footage of each room
			System.out.print("Please enter the square footage of room " + (index+1) + ": ");
			roomSize[index] = k.nextInt();
			//adds previous squarefootage with current to get total square feet
			totalSqfeet += roomSize[index];
		}
		
		//formulas
		double gallons = totalSqfeet / 115;
		double hoursWorked = gallons * 8;
		double paintCost = gallons * pricePer;
		double labourCost = hoursWorked * 18;
		double totalCost = labourCost + paintCost;
		
		//line break to show case new information
		System.out.println();
		//displays calculated information
		System.out.printf("Number of gallons required to paint: %.2f\n", gallons);
		System.out.printf("Hours of labour required: %.2f\n", hoursWorked);
		System.out.printf("Cost of paint: $%.2f\n", paintCost);
		System.out.printf("Labour Charges: $%.2f\n", labourCost);
		System.out.printf("Total cost of paint job: $%.2f\n", totalCost);

		k.close();
	}
	
	

}
