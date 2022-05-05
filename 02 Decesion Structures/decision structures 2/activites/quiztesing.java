package activites;

import javax.swing.JOptionPane;

public class quiztesing {

	public static void main(String[] args) 
	{
		int books, coupons;
		String input;
		input = JOptionPane.showInputDialog("How many books are being purchased? ");
		
		books = Integer.parseInt(input);
		
		if (books < 1)
			coupons = 0;
		
		else if (books < 3)
			coupons = 1;
		
		else if (books < 5)
			coupons = 2;
		
		else 
			coupons = 3;
		
		JOptionPane.showMessageDialog(null, coupons);
		
		System.exit(0);

	}

}
