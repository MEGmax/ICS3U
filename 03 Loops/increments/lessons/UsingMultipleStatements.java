package lessons;
/*
 * It is possible to execute more than one statement in the initialization expression and the update expression.
 * When using multiple statements in either of these expressions, simply separate the statements with commas.
 * For example, look at the loop in the following code, which has two statements in the initialization expression:
 */

public class UsingMultipleStatements
{
        public static void main(String[] args)
        {
               System.out.println("Example 1:");
                
               // Example 1:
               int a, b;
               // This line declares two integer variables named "a" and "b"
                
               for (a = 1, b = 1; a <= 5; a++)
               // This for loop has two control variables named "a" and "b"
               {
                System.out.println(a + " plus " + b + " equals " + (a + b));
                // This line prints the total sum of every iteration
               }
                
                
               System.out.println("\nExample 2:");
                
               // Example 2:
               // We can further modify the loop to execute two statements in the update expression.
               // Here is an example:
                
               int c, d;
               // This line declares two integer variables named "c" and "d"
                
               for (c = 1, d = 1; c <= 5; c++, d++)
               // This loop has two control variables that are updated with every iteration
               {
                System.out.println(c + " plus " + d + " equals " + (c + d));
               }

            }
        
   /*
    * Connecting multiple statements with commas works well in the initialization and update expressions, but don't try to connect
    * multiple boolean expressions this way in the test expression. If you wish to combine multiple boolean expressions in the test
    * expression, you must use the && or || operators.
    */

}
 