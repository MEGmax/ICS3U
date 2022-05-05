package lessons;

/*
 * Method call statements may be used in control structures like
 * loops, if statements, and switch statements. See example
 * below.
 */


public class LoopCall
{

        public static void main(String[] args)
        {
                System.out.println("Hello from the main nethod.");
                for (int i = 0; i < 5; i++)
                    displayMessage();
                System.out.println("Back in the main method.");
        }
        
        
        // The displayMessage method displays a greeting.
        
        public static void displayMessage()
        {
                System.out.println("Hello from the displayMessage method.");
        }

    }
 
