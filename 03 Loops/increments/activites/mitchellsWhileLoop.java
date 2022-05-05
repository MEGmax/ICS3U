package activites;
import java.util.Scanner;
public class mitchellsWhileLoop
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		 System.out.print("enter ur name:");
		 String name = keyboard.nextLine();
		 name = name.toLowerCase();
		 
		 int last = name.length()-1;
		 char firstL = name.charAt(0);
		char lastL = name.charAt(last);
		 
		
		String f = Character.toString(firstL);
		String l = Character.toString(lastL);
		
			
		while (!(name.equals("done") ))
		 {
			if(f.equals(l)){
			 System.out.println("The first letter of the word matches the last letter of the word.");
			 System.out.print("enter ur name:");
			  name = keyboard.nextLine();
			  name = name.toLowerCase();
				 
			  	last = name.length()-1;
				firstL = name.charAt(0);
				lastL = name.charAt(last);
				
				 f = Character.toString(firstL);
				 l = Character.toString(lastL);
				
			}
			else
			{
				System.out.println("The first letter of the word does not match the last letter of the word.");
				 System.out.print("enter ur name:");
				  name = keyboard.nextLine();
				  name = name.toLowerCase();
					 
				  	last = name.length()-1;
					firstL = name.charAt(0);
					lastL = name.charAt(last);
					
					 f = Character.toString(firstL);
					 l = Character.toString(lastL);
					
			
			}
		 }
		System.out.println("The word \"done\" has been entered. Program has ended.");
			
		 keyboard.close();
		 
		 
	}

}