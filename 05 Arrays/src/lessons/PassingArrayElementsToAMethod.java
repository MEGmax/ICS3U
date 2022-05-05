package lessons;
/*
 * Passing Array Elements as Arguments to Methods:
 * 
 * This program demonstrates passing individual array elements as arguments to a method.
 * Methods can be written to store values in an array, display an array's contents, total
 * all of an array's elements, calculate their average, and so forth. Usually, such methods
 * accept an Array as an argument.
 */

public class PassingArrayElementsToAMethod
{
    public static void main(String[] args)
    {
        int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40 };
        // This statement initializes an integer array referenced by the
        // "numbers" variable.

        for (int index = 0; index < numbers.length; index++)
        {
            showValue(numbers[index]);
        }
        // This loop calls the showValue method. Each time showValue is called,
        // an array element is passed to the method. The showValue method has
        // an int parameter variable named n, which receives the argument.
    }

    public static void showValue(int n)
    // This method simply displays the contents of n. In this case, it is the
    // elements of the "numbers" array.
    {
        System.out.print(n + " ");
    }
}