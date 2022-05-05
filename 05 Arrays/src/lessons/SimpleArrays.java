package lessons;
/*
 * An array is a collection of values all wrapped up and given a name. It is the idea of having
 * multiple values all contained in one named variable. Simple arrays are very easy to code,
 * but they're not particularly flexible. There are couple things to know about simple arrays.
 * 
 * 1. First, all of the items in an array must be of the same type, so you can create an array of
 *    integers or create an array of strings, but you can't create an array that contains both.
 * 2. When you declare an array, it's always of a fixed size. You set the size when you declare
 *    it and you can't change the size at runtime.
 * 
 * There are few different syntax styles that we can use to declare and initialize an array.
 * 
 */
public class SimpleArrays
{
    public static void main(String[] args)
    {

        // Example 1: Syntax
        System.out.println("Syntax Example 1: Post datatype");

        int[] a1 = new int[3];
        // We start with the data type of the array, followed by a pair of brackets, then we assign the
        // array name. We place an equals operator and then initialize the array using the new keyword,
        // the data type and the brackets again with the size. The number inside the brackets is the
        // array's "size declarator". The "size declarator" indicates the number of elements, or values,
        // the array can hold. Each element is assigned a number known as a "subscript". A "subscript" is used
        // as an index to pinpoint a specific element within an array. The first element is assigned the subscript 0,
        // the second element is assigned 1, and so forth. In this example, this array can hold three (3) integers values.
        // The three (3) elements in this array has subscripts 0 through 2.

        System.out.println("The size declarator of array a1 ia " + a1.length);
        System.out.println("Index 0 is " + a1[0]);
        System.out.println("Index 1 is " + a1[1]);
        System.out.println("Index 2 is " + a1[2]);
        


        //-------------------------------------------------------------------------------------------------
        
        // Example 2: Syntax
        // This code is almost exactly as the first example. The only difference is that we moved the brackets
        // from after the data type, and placed them after the array name. This variation does exactly the
        // same thing as the first version. It creates an array of three items and the items will have their
        // default value.
        System.out.println("\nSyntax Example 2: Post array name");

        int a2[] = new int[3];
        System.out.println("The size declarator of array a2 ia " + a2.length);
        System.out.println("Index 0 is " + a2[0]);
        System.out.println("Index 1 is " + a2[1]);
        System.out.println("Index 2 is " + a2[2]);
        
    

        //-------------------------------------------------------------------------------------------------
        
        // Example 3: Syntax
        System.out.println("\nSyntax Example 3: ");

        int a3[] = {3, 6, 9};
        // This line initializes the values in the declaration statement. We start off with the data type,
        // we place the brackets either after the data type or after the array name, and then put in a pair
        // of curly braces with our list of items as a comma delimited list. The number of items in the array
        // and their values are determined by that list. As with the previous declarations, once the array is
        // set to have a particular number of items it will always have that number of items, you can't change
        // it at runtime.
        System.out.println("The size declarator of array a3 ia " + a3.length);
        System.out.println("Index 0 is " + a3[0]);
        System.out.println("Index 1 is " + a3[1]);
        System.out.println("Index 2 is " + a3[2]);
    }
} 

/* Recap:
 * 
 * So when using simple arrays, remember that the syntax can vary a little bit. You can place
 * the initial brackets either after the data type or after the array name and you can either
 * use the new keyword and an explicit number of items in the array, or you can use a comma delimited
 * list wrapped in braces. Either way the array must contain items all of the same data type and it is
 * not resizable at runtime.
 */