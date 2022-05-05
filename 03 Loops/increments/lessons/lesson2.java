package lessons;

/*
A loop is a part of a program is repeated over and over, until a specific goal
is reached. Loops are important for calculations that require repeated steps
and for processing input consisting of many data items. The while loop has two
important parts: (1) do a boolean expression that is tested for a true or false
value, and (2) a statement or block of statements that is repeated as long as the
expression is true. In a loop, we need to have something that will tell it when to
stop iterating (stop looping). An iteration is when the loop has executed its block
of code once. A control variable is used to "keep track" of how many times a loop
has iterated. Without a control variable, a loop will not have any indication when
to stop. This can result in an infinite loop. 
*/

public class lesson2
{
  public static void main(String[] args)
  {
     // This statement sets "number" as a control variable
     int number = 1;

     // This while loop tests the variable "number" to
     // determine whether it is less than or equal to 5.
     // if true, it will run its block of code. At the end
     // of the block, it will test the expression again.
     // The expression will result in true once more
     // because the value of number will be 2, and 2 is
     // less than 5 therefore true, so run the block
     // again... It will continue with this process until
     // the expression is false. At some point number will
     // not be less than or equal to 5, at that point, the loop
     // will no longer run and the program will continue with
     // whatever code comes after. Each time a loop runs its block
     // of code, we call that an "iteration". In this case, this loop
     // will have iterated 5 times.
     while (number <= 5)
     {
        System.out.println("Hello");
        // Print "Hello"

        number++;
        // Add 1 to the current value of number.
        // Removing this line will cause an infinite loop
     }
      
     System.out.println("That's all!");
  }
}
