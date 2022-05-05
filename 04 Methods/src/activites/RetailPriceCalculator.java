package activites;

import java.util.Scanner;

public class RetailPriceCalculator {

	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter the wholesale cost of the item: ");
		double wholeSaleP = k.nextDouble();
		
		System.out.println("Please enter the markup percentage: ");
		double markupAmt = k.nextInt();
	
		double retailPrice = calculateRetail(wholeSaleP, markupAmt);
		
		System.out.printf("The total retail price is $%,.2f", retailPrice);
	
		k.close();
		
	}

	
	public static double calculateRetail(double price, double markUp)
	{
		double extra = price * (markUp / 100);
		double result = extra + price;
		return result;
	}
	
	
	

}
