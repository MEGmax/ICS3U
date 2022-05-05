package activites;

import java.util.Scanner;

public class whileLoopAct2 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//holds value for input so error does not occur
		String input = "holder";
		
		//runs this block code while the user input does not equal "done", which will always be the case since input is declared as "holder"
		while (!(input.equals("done")))
		{
			
		//Ask user for input 
		System.out.println("Enter a word: ");
		input = keyboard.nextLine();
		
		//will be lower case so it doesn't mess with the cases
		input = input.toLowerCase();
		
		//adjust positioning since char starts at 0
		int last = input.length()-1;
		
		//get first letter of word
		char firstL = input.charAt(0);
		
		//get last letter of word
		char lastL = input.charAt(last);
        
		//converting char to string
		String f = Character.toString(firstL);
		String l = Character.toString(lastL);
		
			//checks if first letter equals last letter
			if (f.equals(l))
			{
				System.out.println("The first letter of the word matches the last letter of the word.");
							
			}
			//if first letter does not equal last letter
			else 
			{
				System.out.println("The first letter of the word does not match the last letter of the word. ");
				
			}
			
			
		}
			
		
		//if the word "done" is entered, finishes the program
		System.out.println("The word \"done\" has been entered. The prgram has ended. ");
		
		keyboard.close();
		
		
	}

}
