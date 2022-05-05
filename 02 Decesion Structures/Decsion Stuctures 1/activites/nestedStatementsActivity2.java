package activites;

import java.util.Scanner;

public class nestedStatementsActivity2
{

	public static void main(String[] args)
	{	
		Scanner keyboard = new Scanner(System.in);
		
		double x;
		double y;
		double z;
	
	System.out.print("Enter amount for x: ");
	x = keyboard.nextDouble();	
	
	System.out.print("Enter amount for y: ");
	y = keyboard.nextDouble();
	
	if (x > 0)
	{	
		if (y > 20)
		{
			z = 1;
			System.out.println("z = "+ z);
		}
		else
		{
			z = 0;
			System.out.println("z = "+ z);
		}
	}
	else
	{
		z = 0;
		System.out.println("z = "+ z);
	}
	
	keyboard.close();
		

	}

}