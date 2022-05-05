package lessons;

public class PassingMultipleArgumentsAndDataTypes
{
    public static void main(String[] args)
    {
        // Argument and Parameter Data Type Compatibility:
        // Java will automatically perform a widening conversion if the
        // argument's data type is ranked lower than the parameter
        // variable's data type. For example, the displayValue method has an int
        // parameter variable. Both of the following code
        // segments will work because the short and byte arguments are
        // automatically converted to an int:

        System.out.println("Example 1: ");
        short s = 1;
        displayValue(s);
        // Converts short to int.

        // ------------------------------------------------------------------------------------------------------------

        System.out.println("\nExample 2: ");
        byte b = 2;
        displayValue(b); // Converts byte to int
        // Java will not automatically convert an argument to a lower-ranking
        // data type. This means that a long, float, or double
        // value cannot be passed to a method that has an int parameter
        // variable. For example, the following code will cause
        // a compiler error:

        // double k = 1.0;
        // displayValue(k); // Error! Can't convert double to int.

        // You can use a cast operator to convert a value manually to a
        // lower-ranking data type. See example 3.

        // ------------------------------------------------------------------------------------------------------------

        System.out.println("\nExample 3: ");
        double k = 1.0;
        displayValue((int) k); // This will work.

        // ------------------------------------------------------------------------------------------------------------

        // Passing Multiple Arguments:
        // Often it is useful to pass more than one argument to a method. See
        // the "showSum" method below.

        System.out.println("\nExample 4: ");
        showSum(5, 10);

        // The following code segment shows one more example. This time we are
        // passing variables as arguments.
        double value1 = 2.5;
        double value2 = 3.5;
        showSum(value1, value2);
        // When the showSum methods executes as a result of this code, the num1
        // parameter will contain 2.5 and the num2 parameter will contain 3.5.

    }

    public static void displayValue(int x)
    {
        System.out.println("The value of argument is " + x);
    }

    public static void showSum(double num1, double num2)
    {
        double sum; // To hold the sum
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
        // Notice that two parameter variables, num1 and num2 are declared
        // inside
        // the parentheses in the method header. This is often referred to as a
        // "parameter
        // list". Also notice that a comma separates the declarations. See the
        // "showSum"
        // call statement in the main method.
    }
}