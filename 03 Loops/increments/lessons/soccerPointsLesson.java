package lessons;
/*
 * The program in the previous example requires the user to know in advance the number of
 * days for which he or she has sales figures. Sometimes the user has a very long list of
 * input values, and doesn't know the exact number of items. In other cases, the user might be
 * entering values from several lists and it is impractical to require that every item in every
 * list is counted. A technique that can be used in these situations is to ask the user to enter
 * a "sentinel value" at the end of the list. A sentinel value is a special value that cannot be
 * mistaken as a member of the list, and it signals that there are no more values to be
 * entered. When the user enters the sentinel value, the loop terminates. The program
 * below shows an example. It calculates the total points earned by a soccer team over
 * a series of games. It allows the user to enter the series of game points, and then enter
 * -1 to signal the end of the list.
 */

import java.util.Scanner;

public class soccerPointsLesson
{

        public static void main(String[] args)
        {
                int points;
                // This line declares an integer variable named "points"
                
                int totalPoints = 0;
                // This line declares and initializes an integer variable named "totalPoints".
                // This variable will be used as the "accumulator".
                
                Scanner keyboard = new Scanner(System.in);
                // This lines creates a Scanner object for keyboard input.
                
                
                System.out.println("Enter the number of points your team"); 
                System.out.println("has earned for each game this season.");
                System.out.println("Enter -1 when finished.");
                System.out.println();
                // These lines of code display the instructions for the user.
                
                System.out.print("Enter game points or -1 to end: ");
                // This line asks the user to enter the points or -1 to end.
                
                points = keyboard.nextInt();
                // This line assigns the value entered by the user to the variable "points"
                
                
                while (points != -1)
                // This while loop will accumulate the points until -1 is entered.
                {
                    totalPoints += points;
                    // This line adds points to "totalPoints".
                    
                    System.out.print("Enter game points or -1 to end: ");
                    // This line asks the user to enter the points or -1 to end.
                    
                    points = keyboard.nextInt();
                    // This line assigns the value entered by the user to the variable "points"
                    
                }
                
                System.out.println("\nThe total points are " + totalPoints);
                // This line displays the total number of points.
        }
}

/*
 * The value -1 was chosen for the sentinel because it is not possible for a team to score negative points.
 * Notice that this program performs a priming read to get the first value. This makes it possible for the
 * loop to terminate immediately if the user enters -1 as the first value. Also note that the "sentinel value"
 * is not included in the running total.
 */