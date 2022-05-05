package projectsOnline;

import java.util.Scanner;

public class currencyConverter {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		//ask user for amount in CAD
		
		double CAD;
		
		System.out.println("Enter amount in CAD");
		CAD = keyboard.nextDouble();
		
		double USD = CAD * 1.25;
		
		System.out.println("Your " + CAD + " CAD is worth " + USD + " USD.");
		
		keyboard.close();

	}

}
