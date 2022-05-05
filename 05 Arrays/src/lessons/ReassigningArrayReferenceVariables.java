package lessons;
//It is possible to reassign an array reference variable to a different array,
//as demonstrated by the following code:

public class ReassigningArrayReferenceVariables
{

  public static void main(String[] args)
  {
      // Example 1: Reassigning Array Reference Variables
      System.out.println("Example 1: Reassigning Array Reference Variables");

      int[] numbers = new int[10];
      // This line creates an array referenced by the "numbers" variable.

      numbers = new int[5];
      // This line reassigns "numbers" to a new array.

      // http://www.mrpetti.com/computerScience/ICS4U/figure_7_7.html
  }
}