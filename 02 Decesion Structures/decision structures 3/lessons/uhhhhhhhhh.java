package lessons;

import java.util.Scanner;

public class uhhhhhhhhh {

	public static void main(String[] args) 
	{

		int num1, num2, num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1 = input.nextInt();
		
		System.out.println("Enter the second");
		num2 = input.nextInt();
		
		System.out.println("Enter the third");
		num3 = input.nextInt();
		
		if (num1 == num2 && num2 ==num3)
		{
			System.out.println("They are all the same");
		}
		
		else if (num1 != num2 && num2 != num3)
		{
			System.out.println("They are all different");
		}
		
		else
		{
			System.out.println("Neither");
		}

	}

}
