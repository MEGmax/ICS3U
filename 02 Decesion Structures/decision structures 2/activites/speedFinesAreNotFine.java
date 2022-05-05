package activites;

import java.util.Scanner;


public class speedFinesAreNotFine 

{

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		int speedLimit;
		int speed;
		
		System.out.print("Enter the speed limit in km/h: ");
		speedLimit = keyboard.nextInt();
		
		System.out.print("Enter the speed of your car in km/h: ");
		speed = keyboard.nextInt();
		
		//within the speed limit
		if (speed <= speedLimit)
		{
			System.out.print("Congratulations, you are within the speed limit!");
		}
		
		//over by 1 to 20km/h
		else if (speed >= speedLimit && speed <= (speedLimit + 20))
		{
			System.out.print("You are speeding and your fine is $100");
		}
		
		//over by 21 to 30 km/h
		else if (speed >= (speedLimit + 21) && speed <= (speedLimit + 30))
		{
			System.out.println("You are speeding and your fine is $270");
		}
		
		//over by 31km/h or greater 
		else if (speed >= (speedLimit + 31))
		{
			System.out.println("You are speeding and your fine is $500");
		}
		
		//if a negative number is imputed (error message)
		else 
		{
			System.out.println("Error: Please enter a valid speed");
		}
		
		keyboard.close();
	
		

	}

}
