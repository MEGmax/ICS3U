package activites;

public class switchStatementAct5 {

	public static void main(String[] args) 
	{
		int funny = 7, serious = 15;
		funny = serious * 2;

		switch (funny)
		{
		  case 0:
		    System.out.println("That is funny.");
		    break;
		    
		  case 30:
		    System.out.println("That is serious.");
		    break;
		    
		  case 32:
		    System.out.println("That is seriously funny.");
		    break;
		    
		  default:
		    System.out.println(funny); 
		} 
		
		//The following code will always display "That is serious" since serious * 2 is 30 and there is a case for funny equaling 30

	}

}
