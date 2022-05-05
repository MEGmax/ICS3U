package lessons;
/*
 * In a general sense, a method is a collection of statements that performs a specific task.
 * Methods are commonly used to break a problem into small, manageable pieces. Instead
 * of writing one long method that contains all of the statements necessary to solve a problem,
 * several small methods that each solve a specific part of the problem can be written. These
 * small methods can then be executed in the desired order to solve the problem. This approach
 * is sometimes called "divide and conquer" because a large problem is divided into several smaller
 * problems that are easily solved.
 * 
 * Parts of a Method Header:
 * 
 * public static void displayMessage()
 *      {
 *          System.out.println.("Hello from the displayMessage method.");      
 *      }
 *      
 *      public static: Method Modifiers
 *      void: Return Type
 *      displayMessage: Method Name
 *      
 */

// The program below calls and defines a simple method.

public class SimpleMethods
{

  public static void main(String[] args)
  {
            System.out.println("Hello from the main method.");
            
            
            greeting();
            // The JVM branches to the "displayMessage()" method 
            // and performs the statement in its body.
            
            System.out.println("Back in the main method.");
  }
    
    
        // The display method displays a greeting
    
    
  public static void greeting()
  {
            System.out.println( "Hello from the displayMessage method.");
  }

}