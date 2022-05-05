package activites;

import java.util.Scanner;

public class barChartActivity {

	public static void main(String[] args)
	{
		int sales1;
		int sales2;
		int sales3;
		int sales4;
		int sales5;
		
		int star1;
		int star2;
		int star3;
		int star4;
		int star5;
		
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter todays sales for store 1: ");
		sales1 = keyboard.nextInt();
		System.out.println("Enter todays sales for store 2: ");
		sales2 = keyboard.nextInt();
		System.out.println("Enter todays sales for store 3: ");
		sales3 = keyboard.nextInt();
		System.out.println("Enter todays sales for store 4: ");
		sales4 = keyboard.nextInt();
		System.out.println("Enter todays sales for store 5: ");
		sales5 = keyboard.nextInt();
		
		star1 = sales1 / 100;
		star2 = sales2 / 100;
		star3 = sales3 / 100;
		star4 = sales4 / 100;
		star5 = sales5 / 100;
		
		System.out.println("\nSALES BAR CHART");
		System.out.print("Store 1: ");
		for (int q = 0; q < star1; q++)
			{ 
				System.out.print("*");
			}
			System.out.println("\n");
		
			System.out.print("Store 2: ");
			for (int w = 0; w < star2; w++)
				{
					System.out.print("*");
				}
				System.out.println("\n");
				
				System.out.print("Store 3: ");
				for (int e = 0; e < star3; e++)
					{
						System.out.print("*");
					}
					System.out.println("\n");
					
					System.out.print("Store 4: ");
					for (int r = 0; r < star4; r++)
						{
							System.out.print("*");
						}
						System.out.println("\n");
						
						System.out.print("Store 5: ");
						for (int t = 0; t < star5; t++)
							{
								System.out.print("*");
							}
							System.out.println("\n");
		
		
		keyboard.close();
		

	}

}
