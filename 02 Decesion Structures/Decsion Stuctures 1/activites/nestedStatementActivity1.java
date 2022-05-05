package activites;

import javax.swing.JOptionPane;

public class nestedStatementActivity1 
{

	public static void main(String[] args) 
	
	{
		
		int amount1;
		int amount2;
		String input1;
		String input2;
		
		
		input1 = JOptionPane.showInputDialog("Enter amount 1");
		amount1 = Integer.parseInt(input1);
		
		input2 = JOptionPane.showInputDialog("Enter amount 2");
		amount2 = Integer.parseInt(input2);
		
		if (amount1 > 10)
		
		{
			if (amount2 < 100)
			{
				if (amount1 > amount2)
				{
					System.out.print("The greater value you entered was " + amount1);
				}
				else
					{
						System.out.print("The greater value you entered was " +amount2);
					}
			}
		
		
		}
		if (amount2 > 100)
			System.out.print("Please make amount 2 less than 100");
	
		if (amount1 < 10) 
		{
			System.out.print("Please make amount 1 greater than 10");
		}
		
		System.exit(0);

}
}
