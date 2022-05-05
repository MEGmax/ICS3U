package lessons;
//Because an array is an object, there is a distinction between an array and the variable that references it.
//The array and the reference variable are two separate entities. This is important to remember when we want
//to copy the contents of one array to another. As we have seen in the previous code, you cannot copy an array
//by merely assigning one array reference variable to another. Instead, to copy an array you need to copy the
//individual elements of one array to another. Usually, this is best done with a loop, such as the following:

public class CopyingArrays
{
  public static void main(String[] args)
  {
      int[] firstArray = { 5, 10, 15, 20, 25 };
      // This statement creates and initializes an array of five elements referenced by a variable named "firstArray"

      int[] secondArray = new int[5];
      // This statement creates an array of five elements referenced by a variable named "secondArray"

      for (int index = 0; index < firstArray.length; index++)
      {
          secondArray[index] = firstArray[index];
          // This loop copies all the contents of "firstArray" into "secondArray".                    
      }


      for (int i = 0; i < secondArray.length; i++)
      {
          System.out.println(secondArray[i]);
          // This loops displays the copied contents of "secondArray"
      }
  }
}
