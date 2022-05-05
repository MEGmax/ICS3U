package activites;

import java.util.Scanner;


public class inputActivity2 {

	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner (System.in);
		
		double purchasePrice;
		double amountOfProvincialTax;
		double amountOfCountyTax;
		double totalPrice;
		double totalTax;
		double provincialTaxRate = 0.04;
		double countyTaxRate = 0.02;
		
		//amount before tax
		System.out.print("What was the amount of your purchase? ");
		purchasePrice = keyboard.nextDouble();
		
		//amount of provincial tax
		amountOfProvincialTax = purchasePrice * provincialTaxRate;
		
		//amount of county tax
		amountOfCountyTax = purchasePrice * countyTaxRate;
		
		//total tax 
		totalTax = amountOfProvincialTax + amountOfCountyTax;
		
		//total price
		totalPrice = purchasePrice + totalTax;
		
		//output data
		System.out.println("The amount before tax is: $" + purchasePrice);
		System.out.println("The amount of county tax paid is: $" + amountOfCountyTax);
		System.out.println("The amount of provincal tax paid is: $" + amountOfProvincialTax);
		System.out.println("The amount of tax paid: $" + totalTax);
		System.out.println("The amount paid in total is: $" + totalPrice);
		
		
		keyboard.close();

		
		
		
		
		
		
		
	}

}
