package lessons;
/*
 * It is very common for programs not only to store and process information stored in arrays,
 * but also to search arrays for specific items. The "sequential search algorithm" uses a loop
 * to sequentially step through an array, starting with the first element. It compares each
 * element with the value being searched and stops when the value is found or the end of
 * the array is encountered. If the value being searched for is not in the array, the algorithm
 * unsuccessfully searches to the end of the array. The SearchArray program below searches the
 * a five-element array named "tests" to find a score of 100. It uses a sequentialSearch method
 * to find the value in the array. The array that is passed as an argument into the array parameter
 * is searched for an occurrence of the number passed into value. If the number is found, its array
 * subscript is returned. Otherwise, -1 is returned, indicating the value did not appear in the array.
 */


// This program sequentially searches an int array for a specified value.

public class SearchArray
{
    public static void main(String[] args)
    {
        int[] tests = { 87, 75, 98, 100, 82 };
        // This line declares and initializes an integer array named "tests"

        int results;
        // This line declares an integer variable named "results"
        // This will store the subscript where the value is found.

        results = sequentialSearch(tests, 100);
        // This line calls the sequentialSearch method. Notice that we send it two arguments.
        // The first argument is the "tests" array and the second argument is the value we would
        // like to find in the array.

        // Determine whether 100 was found and display an appropriate message.
        if (results == -1)
            // This line determines what to print if match or mismatch has been found
        {
            System.out.println("You did not earn 100 on any test.");
            // This line will print if a match is not found
        }
        else
        {
            System.out.println("\nFinal output: You earned 100 on test " + (results + 1));
            // This line will print if a match is found
        }
    }



    public static int sequentialSearch(int[] array, int value)
    {
        int index = 0;
        // This statement declares and initializes a loop control variable named "index" with a value
        // of 0, specifying the starting point of the search.

        int element = -1;
        // The "element" variable holds the element where the value is found. It is initialized with
        // a value of -1 since -1 is the default value if the value is not found.

        boolean found = false;
        // The boolean variable "found" is used as a Flag, indicating search results. It is initialized to
        // false (meaning "not found").

        // Search the array.
        System.out.println("\n\"element\" variable before loop: " + element); // trace element
        System.out.println("\"found\" variable before loop: " + found); // trace found
        System.out.println("\"index\" variable before loop: " + index); // trace index

        while (!found && index < array.length)
            // This loop will iterate as long as "not" "found" is true and index is less than the length of the array
        {
            System.out.println("\nIteration: " + index); // trace index as iteration
            System.out.println("\"element\" variable in loop: " + element); // trace "element"
            System.out.println("\"found\" variable in loop: " + found); // trace "found"
            System.out.println("Comparing array index " + index + " value " + array[index] + " with 100."); // trace array[index] with 100

            if (array[index] == value)
                // This line checks if the value of each element is equal to 100
            {
                found = true;
                element = index;
                // These statements will set "found" to true and "element" to the index value if the
                // condition is true
                System.out.println("\n\"element\" variable in condition loop: " + element); // trace "element"
                System.out.println("\"found\" variable in condition loop: " + found); // trace found
                System.out.println("\"index\" variable in condition loop: " + index); // trace index
            }
            index++;
            // This line will increment index by a value of 1 after every iteration.
        }

        return element;
        // This line returns -1 if there is no match or index value if a match is found
    }
}
 