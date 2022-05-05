package lessons;
import java.util.ArrayList; // Needed for ArrayList class
import java.util.Random;    // Needed for generating random numbers
import java.util.Collections;   // Needed for sorting arrayList arrays.


/*
   This program demonstrates how to create an ArrayList object, how to
   add content, and how to print its content.
 */

public class ArrayListDemo1
{
    public static void main(String[] args)
    {
        Random randNum = new Random();
        // This statement creates a random number object named "randNum"

        ArrayList<string> nameList = new ArrayList<string>();
        // Create an ArrayList to hold some names

        ArrayList<integer> numberList = new ArrayList<integer>();
        // Create an ArrayList to hold some integers.

        ArrayList<character> charList = new ArrayList<character>();
        // Create an ArrayList to hold chars.

        ArrayList<double> doubleList = new ArrayList<double>();
        // Create an ArrayList to hold chars.


        // ----------------------------------------------------------------------------------------------------------------
        // Example 1: Adding and removing names from a list.
        // Add some names to nameList.
        nameList.add("Tommy");          // "Tommy" is placed at index 0
        nameList.add("Bobby");              // "Bobby" is placed at index 1
        nameList.add("Frankie");            // "Frankie" is placed at index 2
        nameList.set(1, "Charlie");     // "Bobby" is removed at index 1 and replaced by "Charlie"
        nameList.add(0, "Jimmy");       // "Jimmy" is added to the array at index 0
        // "Tommy" has now been moved to index 1
        // "Bobby was replaced by "Charlie" which is now at index 2
        // "Frankie" is now at index 3
        // nameList.remove(1);                      // This line removes "Tommy" from index 1

        System.out.println(nameList);
        // This line prints the contents of the nameList array.


        // ----------------------------------------------------------------------------------------------------------------
        // Example 2: Adding Random numbers to the numberList array
        // Add some numbers to the numberList
        for (int i = 0; i < 10; i++)
        {
            numberList.add(randNum.nextInt(10));
        }

        Collections.sort(numberList);
        // This statement sorts the values in the numberList array from lowest
        // to highest.

        // This statement returns the size of the array.
        System.out.println("\nThere are " + numberList.size() + " numbers in the numberList array. The numbers are:");

        // This for loop displays the items contained in the numberList array.
        for (int i = 0; i < numberList.size(); i++)
        {
            System.out.print(numberList.get(i) + " ");
            // The get method returns the content from a specific index
        }


        // ----------------------------------------------------------------------------------------------------------------
        // Example 3: Sorting and searching the nameList array.

        System.out.println("\n\nThe nameList array has " + nameList.size() + " objects stored in it.");
        // Display the size of the nameList array.

        //Collections.sort(nameList);

        // This enhanced for loop displays the items in the nameList array.
        for (String i: nameList)
        {
            System.out.print(i + " ");
        } // end of for loop

        System.out.println("\n\nThe index of your request is "  + nameList.indexOf("Frankie"));
        // This statement prints the index of the item requested.

        System.out.println("\nThe index of your request is "  + nameList.indexOf("Tommy"));
        // This line returns -1 because "Tommy" was removed from the list.

        // This if statement returns true if searched item is contained in the array.
        if(nameList.contains("Jimmy"))
        {
            System.out.println("\nThe nameList array contains your request");
        }
        else
        {
            System.out.println("\nThe nameList array does not contain your request");
        }
    }  // end of main
}  // end of class
</double></double></character></character></integer></integer></string></string>