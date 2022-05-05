package lessons;
//This code determines weather "firstArray" and "secondArray" contain the same
//values by first comparing their lengths and then their corresponding elements.

public class UsefulArrayAlgorithimsAndOperations
{
  public static void main(String[] args)
  {
      // Comparing Arrays

      int[] firstArray = { 2, 4, 6, 8, 10 };
      int[] secondArray = { 2, 4, 6, 8, 10 };

      boolean arraysEqual = true;
      // This statement creates a boolean variable that will be used to signal whether the arrays are equal.

      int index = 0;
      // This statement creates an integer variable that is used as a loop control variable

      if (firstArray.length != secondArray.length)
          // This conditional statement determines whether the two arrays are the same length. If they are not the same length,
          // then the arrays cannot be equal, so the flag variable arraysEqual is set to false. 
      {
          arraysEqual = false;
          // This statement sets the "arraysEqual" flag to "false" if the array lengths are not equal.
      }

      // Next, we determine whether the elements contain the same data.

      while (arraysEqual && index < firstArray.length)
          // This while loop executes as long as arraysEqual is true and the control variable index is
          // less than firstArray.length.
      {
          if (firstArray[index] != secondArray[index])
              // This statement compares a different set of corresponding elements in the arrays during each iteration.
          {
              arraysEqual = false;
              // This statement sets the the flag variable to false when it finds two corresponding elements that have
              // different values.
          }
          index++;
          // This statement increments index by 1 at the end of every iteration.
      }

      if (arraysEqual)
          // This statement examines the arraysEqual variable after the loop finishes. If the variable is true, then the
          // arrays are equal and a message "The arrays are equal" is printed. 
      {
          System.out.println("\nThe arrays are equal.");
      }
      else
      {
          System.out.println("\nThe arrays are not equal.");
          // This statement will execute if the arrays are not equal.
      }

  }
}
