package activites;

import java.util.Scanner;

public class speedOfSound {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int distance;
		double time;
		double y;
		
		System.out.println("The following table shows the approximate speed of sound in water, air and steal:");
		System.out.println("Medium		Speed");
		System.out.println("----------------------------------------");
		System.out.println("Air		1100 feet per second");
		System.out.println("Water		4900 feet per second");
		System.out.println("Steel		16400 feet per second ");
		
		System.out.println("\nEnter the medium you would like to travel through");
		String medium = keyboard.nextLine();
		
		System.out.println("\nEnter the distance you would like to travel (in feet)");
		distance = keyboard.nextInt();
		
		medium = medium.toUpperCase();
		
		switch (medium)
		{
		case "AIR":
			y = 1100;
			break;
			
		case "WATER":
			y = 4900;
			break;
			
		case "STEEL":
			y = 16400;
			break;
			
		default:
			System.out.println("Invalid medium");
			y = 0;
			break;
		
		}
		
		time = distance / y;
		
		if (time != 0)
		{
		System.out.println("It will take sound " + time + " seconds to travel " + distance + " feet in the medium of " + medium);
		}
		
		keyboard.close();
		
		
		
		
		

	}

}
