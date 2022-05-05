package activites;

import java.util.Scanner;

public class nestedLoopsAct3 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		
		int years;
		int year;
		int month;
		int rainfall = 0;
		int totalMonths;
		int totalRainfall = 0;
		int averageRainfall;
		
		System.out.println("Please enter the number of years: ");
		years = keyboard.nextInt();
	
		
		for (year = 1; year <= years; year++)
		{
			
			for (month = 1; month <= 12; month++)
			{
				System.out.println("Please enter the rainfall in inches for year " + year + " month " + month + " : ");
				rainfall = keyboard.nextInt();
				totalRainfall += rainfall;

				while (rainfall < 0)
				{
					System.out.println("That is not a valid number. ");
					System.out.println("Please enter the rainfall in inches for year " + year + " month " + month + " : ");
					rainfall = keyboard.nextInt();

				}
			}
		
		}

		totalMonths = years * 12;
		averageRainfall = totalRainfall / (years * 12);
		
		System.out.println("The total number of months is: " + totalMonths);
		System.out.println("The total rainfall is: " + totalRainfall + " inche(s)");
		System.out.println("The monthly average amount of rainfall is: " + averageRainfall + " inche(s)");
		
		keyboard.close();
		
	}

}

