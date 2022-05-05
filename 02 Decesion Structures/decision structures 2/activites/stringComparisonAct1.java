package activites;

import java.util.Scanner;

public class stringComparisonAct1 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name1;
		String name2;
		String name3;
		
		
		System.out.println("Please enter the first name: ");
		name1 = keyboard.nextLine();
		
		System.out.println("Please enter the second name: ");
		name2 = keyboard.nextLine();
		
		System.out.println("Pleaae enter the third name: ");
		name3 = keyboard.nextLine();
		
		if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0)
		{
			if (name2.compareTo(name3) > 0)
			{
				System.out.println("The names in assending order are: \n" + name1 + "\n" + name3 + "\n "+ name2);
			}
			
			else 
			{
				System.out.println("The names in assending order are: \n" + name1 + "\n" + name2 + "\n" + name3);
			}

		}
		
		else if (name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0)
		{
			if (name1.compareTo(name3) < 0)
			System.out.println("The names in assending order are: \n" + name2 + "\n" + name1 + "\n" + name3);
			
			else
				System.out.println("The names in assending order are: \n" + name2 + "\n" + name3 + "\n" + name1);
		}
		
		else if (name3.compareTo(name1) < 0 && name3.compareTo(name2) < 0)
		{
			if (name1.compareTo(name2) < 0)
				System.out.println("The names in assending order are: \n" + name3 + "\n" + name1 + "\n" + name2);
			else 
				System.out.println("The names in assending order are: \n" + name3 + "\n" + name2 + "\n" + name1);
		}
		
		else 
			System.out.println("Error");
		
		keyboard.close();
		
		
		
		
		
		

	}

}
