package activites;

import java.util.Scanner;

public class distanceTravelledActivity {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		
		int distance;
		int time;
		int speed;
		int counter = 0;
		
		System.out.println("Please enter the speed of the vehicle (in km/h): ");
		speed = keyboard.nextInt();
		
		System.out.println("Please enter the time it took the vehicle to travel (in hours): ");
		time = keyboard.nextInt();
		
		if (speed > 0 && time >= 1)
		{
			System.out.println("Hour		Distance Travlled");
			System.out.println("-----------------------------------");
			
			for (counter = 1; counter < time + 1; counter++)
			{
				distance = counter * speed;
				System.out.println(counter + "			" + distance + "km");
			}
		}
		
		else
		{
			System.out.println("Please enter a positive number for speed AND an amount of time greater than 1");
		}
	
		
		keyboard.close();
	}

}
