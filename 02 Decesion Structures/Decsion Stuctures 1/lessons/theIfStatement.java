package lessons;

import javax.swing.JOptionPane;

public class theIfStatement 
/* write a program that uses JOptionPane to calculate the average of three test scores. The program should ask the user to enter three
 * scores and calculate their average. If their average is greater than 95 the program should output "Thats a great score!"
 */
{

	public static void main(String[] args) 
	{
		double score1;
		double score2;
		double score3;
		double average;
		String input;
		
		//Get first test score
		input = JOptionPane.showInputDialog("Enter score number 1");
		score1 = Double.parseDouble(input);
		
		//Get second test score
		input = JOptionPane.showInputDialog("Enter score number 2");
		score2 = Double.parseDouble(input);
		
		//Get third test score
		input = JOptionPane.showInputDialog("Enter score number 3");
		score3 = Double.parseDouble(input);
		
		average = (score1 + score2 + score3) / 3;
		
		JOptionPane.showMessageDialog(null, "The average is " + average);
		
		if(average >= 95)
		{
			JOptionPane.showMessageDialog(null, "Thats a great score!");
		}
		
		System.exit(0);
		
		
		
		
		
		
		
	}

}
