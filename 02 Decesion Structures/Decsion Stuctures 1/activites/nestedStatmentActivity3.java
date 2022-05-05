package activites;

import java.util.Scanner;

public class nestedStatmentActivity3
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		int x;
		
		System.out.print("Enter a whole number between 1-10: ");
		x = keyboard.nextInt();	
		
		if (x == 1)
		{
			System.out.println("I");
		}
		else
		{
			if(x == 2)
			{
				System.out.println("II");
			}
			else
			{
				if(x==3)
				{
					System.out.println("III");
				}
				else
				{
					if (x == 4)
					{
						System.out.println("IV");
					}
					else
					{
						if(x == 5)
						{
							System.out.println("V");
						}
						else
						{
							if(x == 6)
							{
								System.out.println("VI");
							}
							else
							{
								if (x == 7)
								{
									System.out.println("VII");
								}
								else
								{
									if(x == 8)
									{
										System.out.println("VIII");
									}
									else
									{
										if(x == 9)
										{
											System.out.println("IX");
										}
										else
										{
											if(x==10)
												{
												System.out.println("X");
												}
											else
											{
												System.out.println("error");
											}
										}
									}
							   }
							}
						}
					}
				}
			}
		}
	
		keyboard.close();
	}
}