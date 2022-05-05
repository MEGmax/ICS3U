package lessons;
/*
 * The program below asks the user to enter his or her annual salary
 * and credit rating. The program then determines whether the user qualifies
 * for a credit card. One of two void methods, "qualify" or "noQuality", is called
 * to display a message.
 */

import javax.swing.JOptionPane;

public class CreditExample
{

    public static void main(String[] args)
    {
        double salary; // Annual Salary
        int creditRating; // Credit Rating
        String input; // To hold the user's input

        // Get the user's annual salary.
        input = JOptionPane.showInputDialog("What is your annual salary?");
        salary = Double.parseDouble(input);

        // Get the user's credit rating (1 through 10).
        input = JOptionPane.showInputDialog("On a scale of  " + "1 through 10, what is your credit rating?\n(10 - excellent, 1 - very bad)");
        creditRating = Integer.parseInt(input);

        // Determine whether the user qualifies.
        if (salary >= 20000 && creditRating >= 7)
        {
            qualify();
        }
        else
        {
            noQualify();
        }

        System.exit(0);
    }

    // The qualify method informs the user that he or she qualifies
    // for the credit card.
    public static void qualify()
    {
        JOptionPane.showMessageDialog(null, "Congratulations!  You qualify for the credit card!");
    }

    public static void noQualify()
    {
        JOptionPane.showMessageDialog(null, "Im sorry, you do not qualify for the credit card.");
    }
}