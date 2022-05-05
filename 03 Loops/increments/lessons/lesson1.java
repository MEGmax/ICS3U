package lessons;

//++ and -- are operators that add and subtract one from their operands.

public class lesson1
{
 public static void main(String[] args)
 {
     int number = 4; // number variable starts out with 4
     
     // Display the value in number.
     System.out.println("number is " + number);
  
     // This statement will print "I will increment number."
     System.out.println("I will increment number.");
     
     // Increment number by one.
     number++;
     // This statement is like saying number = number + 1
     // Which is get the current value of number and add 1 to it...
     // Therefore, current value of number is 4, add 1, number is now 5
     // Can also be written as ++number
     
     // Display the value in number again
     System.out.println("Now, number is " + number);
     System.out.println("I will decrement number.");
     
     // Decrement number by 1.
     number--;
     // This statement is like saying number = number - 1
     // Which is get the current value of number and subtract 1 to it...
     // Therefore, current value of number is 5, subtract 1, number is now 4
     // Can also be written as --number
     
     // Display the value in number once more.
     System.out.println("Now, number is " + number);
     
     
     // Prefix and Postfix only matters in statements
     // as seen below:
     
     int numberOne = 4;
     System.out.println("\nPostfix Example:");

     System.out.println("println first: " + numberOne++);
     // This statement will first print the current value of numberOne
     // then it will add 1 to it. Therefore it will print 4, numberOne
     // will have a value of 5 after it has printed the current value.

     System.out.println("After println: " + numberOne);
     // This statement will print 5
     
     
     int numberTwo = 4;
     System.out.println("\nPrefix Example:");

     System.out.println("println first: " + ++numberTwo);
     // This statement will first add 1 to the current value of numberTwo
     // then it will print numberTwo. Therefore it will print 5

     System.out.println("After println: " + numberTwo);
     // This statement will print 5        
 }
}
