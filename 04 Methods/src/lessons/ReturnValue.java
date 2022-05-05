package lessons;
/*
 * A method may send a value back to the statement
 * that called the method. You've seen that data may be passed
 * into a method by way of parameter variables. Data may also be
 * returned from a method, back to the statement that called it.
 * Methods that return a value are appropriately known as
 * "value-returning methods".
 */

// This program demonstrates a value returning method.

public class ReturnValue
{

    public static void main(String[] args)
    {
        int total, value1 = 20, value2 = 40;
        // This line declared and initializes all variables used in the
        // main method

        total = sum(value1, value2);
        // This statement calls the sum method, passing value1 and
        // value2 as arguments. It assigns the value returned in the "sum"
        // method to the "total" variable. In this case, the method will
        // return 60.

        System.out.println("The sum of " + value1 + " and " + value2 + " is " + total);
        // This line displays the contents of all the variables
    }

    // The sum method returns the sum of its two parameters.

    public static int sum(int value1, int value2)
    // The sum method returns the sum of its two parameters. Notice there is int
    // instead of void in the method header
    {
        int result;
        // This line creates a local variable named result

        result = value1 + value2;
        // This line assigns the value of num1 + num2 to result.

        return result;
        // This line return the value in the result variable back to the method
        // that called it.
    }

}

/*
 * Other examples:
 * 
 * int x = 10, y= 15; double average; average = sum(x, y) / 2.0;
 * 
 * In this statement, the sum method is called with x and y as its arguments.
 * The method's return value, which is 25, is divided by 2.0. The result, 12.5,
 * is assigned to average. Here is another example:
 * 
 * int x = 10, y = 15; System.out.println("The sum is " + sum(x, y)); This code
 * sends the sum method's return value to System.out.println, so it can be
 * displayed on the screen.The message "The sum is 25" will be displayed.
 */