package activites;

import java.util.Scanner;

public class ArrayAct2 {

	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		
		double numbers[] = new double[10] ;
		
		
		System.out.println("Please enter 10 numbers:");
		
		for (int counter = 0; counter < 10; counter++)
		{
		numbers[counter] = k.nextDouble();
		}
		
		System.out.println("The last number read was: " + numbers[9] + "\n");
		
		
		for (int counter2 = 8; counter2 != 0; counter2--)
		{
			System.out.println(numbers[counter2] + " differs by the last number by " + (numbers[counter2] - numbers[9]) );
		}
		
		k.close();
		
	}

}
