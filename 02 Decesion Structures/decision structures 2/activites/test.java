package activites;
import java.util.Scanner;
public class test
{

	public static void main(String[] args)
	{
		 Scanner keyboard = new Scanner(System.in);
		
		String n1, n2, n3;

		
		System.out.print("Enter a name: ");
		n1 = keyboard.nextLine();
		System.out.print("Enter another name: ");
		n2 = keyboard.nextLine();
		System.out.print("Enter another name:");
		n3 = keyboard.nextLine();
		
		if (n1.compareTo(n2) < 0 && n1.compareTo(n3) < 0 )
		{ //A=65 M=77    65-77=-12
			if (n2.compareTo(n3) <0)
			{
			System.out.println(n1+"\n"+ n2+"\n"+n3);
			}
			else
			{
				System.out.println(n1+"\n"+ n3+"\n"+n2);
			}
			
		}
		else if(n2.compareTo(n1) < 0 && n2.compareTo(n3) < 0)
		{
			if (n1.compareTo(n3) < 0)
			{
				System.out.println(n2+"\n"+ n1+"\n"+n3);
			}
			else
			{
				System.out.println(n2+"\n"+ n3+"\n"+n1);
			}
		}
		
		else if (n3.compareTo(n1) < 0 && n3.compareTo(n2) < 0)
		{ 
			if(n1.compareTo(n2) < 0)
			{
				System.out.println(n3+"\n"+ n1+"\n"+n2);
			}
			else
			{
				System.out.println(n3+"\n"+ n2+"\n"+n1);
			}
		}
		
		else
		{
			System.out.println("error");
		}
	keyboard.close();
	}

}