package lessons;
/*
 * A method can return a reference to an array. To do so, the return type of the method must be declared properly.
 * This program demonstrates how a reference to an array can be returned from a method.
 */

public class ReturnArray
{
   public static void main(String[] args)
   {
      double[] values;
      // This line declares array double variable named "values"

      values = getArray();
      // This line initializes the "value" variable by calling the getArray method
      
      for (double num : values)
      //  This line iterates through the values array
      {
        System.out.print(num + "  ");
        // This line prints the elements of the "values" array during every iteration
      }

   }

   
   // getArray method

   public static double[] getArray()
   // The getArray method returns an array of doubles. Notice that the return type listed in the method header is double[]
   {
      double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9 };
      // This line contains an array with an initialization list of 5 elements

      return array;
      // This line returns the array to the method call from the main method
   }
}
 