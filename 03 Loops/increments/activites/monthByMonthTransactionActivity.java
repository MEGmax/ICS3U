package activites;

import java.util.Scanner;
	
public class monthByMonthTransactionActivity {

	public static void main(String[] args)

	{
		double accountBalance;
		double yearlyInterestRate;
		double monthlyInterestRate;
		int month;
		double moneyChange;
		double interestCollected;
		
		Scanner keyboard = new Scanner (System.in);

		System.out.println("Please enter your account balance (in dollars): ");
		accountBalance = keyboard.nextDouble();
		
		System.out.println("Please enter your yearly interest rate (as a percentage): ");
		yearlyInterestRate = keyboard.nextDouble();
		
		for (month = 1; month <=12; month++)
		{
			System.out.println("Make a deposit or withdrawl for month " + month + ": ");
			moneyChange = keyboard.nextDouble();
			
			accountBalance = accountBalance + moneyChange;
			
			monthlyInterestRate = yearlyInterestRate / 12;
			interestCollected = (accountBalance * monthlyInterestRate) /100;
			accountBalance = interestCollected + accountBalance;
					
			System.out.printf("You have $ %,.2f including interest \n", accountBalance);
		}
		
		keyboard.close();
		
		
	}

}
