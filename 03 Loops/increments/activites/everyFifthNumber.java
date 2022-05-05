package activites;

public class everyFifthNumber {

	public static void main(String[] args) 
	{
		//start at 0
		int number = 0;
		
		//header
		System.out.println("This is every fifth number from 0-100: ");
		
		//start at 0, count by 5s up until 100 to get every fifth number
		for (number = 0; number <= 100; number+=5)
		{
			System.out.println(number);
		}


	}

}
