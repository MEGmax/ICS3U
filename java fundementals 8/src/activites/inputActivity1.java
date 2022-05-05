package activites;

import java.util.Scanner;

public class inputActivity1 
{

	public static void main(String[] args) 
	
	{
		int age;
		String name;
		String city;
		String uni;
		String job;
		String animal;
		String petName;
		
		Scanner keyboard = new Scanner (System.in);
		
		//get users name
		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		
		//get users city
		System.out.print("What city do you live in? ");
		city = keyboard.nextLine();
		
		//get users age
		System.out.print("What is your age?" );
		age = keyboard.nextInt();
		
		//get users university
		System.out.print("What university did you attend? ");
		uni = keyboard.next();
		
		//break up keyboard input
		keyboard.nextLine();
		
		
		//get users profession
		System.out.print("What is your profession? ");
		job = keyboard.nextLine();
		
		//get users animal type
		System.out.print("What kind of animal do you have? ");
		animal = keyboard.nextLine();
		
		//get users pet name
		System.out.print("What is your pets name? ");
		petName = keyboard.nextLine();
		
		
		System.out.print("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name +
		" went to university at " + uni + ". " + name + " graduated and went to work as a " + job + ". Then, " + name + " adopted a(n) "
		+ animal + " named " + petName + ". They both lived happily ever after!");
		
		
		keyboard.close();

		
		
		

	}

}
