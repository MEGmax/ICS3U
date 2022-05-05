package lessons;
// The for loop is ideal for performing a known number of iterations.

/*
 * A count-controlled loop must possess three elements:
 * 1. It must initialize a "control variable" to a starting value.
 * 2. It must test the control variable by comparing it to a maximum value.
 *    When the control variable reaches its maximum value, the loop terminates.
 * 3. It must update the control variable during each iteration. This is
 *    usually done by incrementing the variable.
 */


public class ForLoops
{
    public static void main(String[] args)
    {
        System.out.println("Example 1:\n");
        
        // Example 1:
        
        int numberOne;
        // This line declares an integer variable named "numberOne".
        // This will be used as the "control Variable".
        
        System.out.println("Number    Number Squared");
        // This line prints a list header
        
        System.out.println("-------------------------");
        // This line prints a dividing line for the list header.
         
        for(numberOne = 1; numberOne <= 10; numberOne++)
        // The first line of the for loop is known as the "loop header". After the key word for, there are three expressions
        // inside the parentheses, separated by semicolons. (Notice there is not a semicolon after the third expression.) The
        // first expression is the "initialization expression". It is normally used to initialize a control variable to its
        // starting value. This is the first action performed by the loop, and it is done only once. The second expression
        // is the "Test Expression". This is a boolean expression that controls the execution of the loop. As long as this
        // expression is true, the body of the for loop will repeat. The for loop is a "pretest-loop", so it evaluates the
        // test expression before each iteration. The third expression is the "update expression". It executes at the end of
        // each iteration. Typically, this is a statement that increments the loop's control variable.
        {
            System.out.println(numberOne + "\t\t" + numberOne * numberOne);
            // This line executes during every iteration
        }
        
        
        System.out.println("\nExample 2: Other Forms of the update Expression");
        
        // Example 2:
        // You are not limited to using increment statements in the update expression. Here is a loop that displays all the
        // even numbers from 2 through 100 by adding 2 to its counter:
        
        for (int numberTwo = 2; numberTwo <= 100; numberTwo += 2)   // Variable declared and initialized in loop 
        {
            System.out.println(numberTwo); 
        }
    }
}