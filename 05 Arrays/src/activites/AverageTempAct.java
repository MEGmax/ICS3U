package activites;

import java.util.Scanner;

public class AverageTempAct {

	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		
		double days[] = new double [10];
		
		double totalTemp = 0;
		int aboveAverage = 0;
		
		
		for (int i = 0; i < days.length; i++)
		{
			System.out.println("Please enter the tempertature of day " + (i+1));
			days[i]=k.nextDouble();
			totalTemp += days[i];
		}
		
		double averageTemp = totalTemp /10;
		
		
		for (int i = 0; i < days.length; i++) 
		{
			if (days[i] > averageTemp)
			{
				aboveAverage++;
			}
		}
		
		System.out.println("The temperature was above the average of " + averageTemp + " degrees for " + aboveAverage + " day(s)");
		

	}
	
	

}
