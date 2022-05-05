package lessons;
//This program demonstrates how two variables can reference the same array.

public class SameArray
{
  public static void main(String[] args)
  {
      int[] array1 = { 2, 4, 6, 8, 10 };
      // This line creates an array and assigns its address to the "array1" variable.

      int[] array2 = array1;
      // This line assigns array1 to array2. This does not make a copy of the array referenced by array1.
      // Rather, it makes a copy of the address that is stored in array1 and stores it in array2. After
      // this statement executes, both the array1 and array2 variables will reference the same array.
      // This type of assignment operation is called a "reference copy". Only the address of the array
      // object is copied, not the contents of the array object.

      array1[0] = 200;
      // This line changes one of the elements using array1

      array2[4] = 1000;
      // This line changes one of the elements using array2

      // Display all the elements using array1
      System.out.println("The contents of array1:");

      for (int i = 0; i < array1.length; i++)
      {
          System.out.print(array1[i] + " ");
          // This loop displays all the elements using array1
      }

      System.out.println();

      // Display all the elements using array2
      System.out.println("\nThe contents of array2:");

      for (int i = 0; i < array2.length; i++)
      {
          System.out.print(array2[i] + " ");      
      }

      System.out.println();
  }
}
