package lessons;
/*
 * A method may be written so it accepts arguments.
 * Data can then be passed into the method when it is called.
 */


public class PassingArgumentsToAMethod
{

    public static void main(String[] args)
    {
        // String str = "Mr. Petti";
        // int number = 0;
        // Values that are sent into a method are called "arguments". We are already
        // familiar with how to use arguments in a method call. For example, look at
        // the following statement:

        // System.out.println("Hello");
        // This statement calls the System.out.println method and passes "Hello" as
        // an argument. Here is another example:

        // number = Integer.parseInt(str);
        // This statement calls the Integer.parselnt method and passes the contents
        // of the str variable as an argument. By using "parameter variables", you can
        // design your own methods that accept data this way. See the displayValue
        // method.


        displayValue(5);
        // This line is an example of a call to the displayValue method, passing 5 as an argument:


        // You may also pass the contents of variables and the values of expressions
        // as arguments, For example, the following statements call the displayValue
        // method with various arguments passed:
        //
        // int x = 10;
        // displayValue(x);
        // displayValue(x * 4);
        // displayValue(Integer.parseInt("700"));
    }


    // A "parameter variable", sometimes simply referred to as a parameter, is a special
    // variable that holds a value being passed into a method. Here is an example of a 
    // method that uses a parameter.
    public static void displayValue(int num)
    {
        System.out.println("The value is " + num);
        // Notice the integer variable declaration that appears inside the parentheses
        // (int num).This is the declaration of a "parameter variable", which enables the
        // displayValue method to accept an integer value as an argument. See the 
        // "displayValue(5)" method call in the main method.
    }
}