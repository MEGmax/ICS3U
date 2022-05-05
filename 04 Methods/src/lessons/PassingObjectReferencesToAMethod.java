package lessons;
/*
 * When an object, such as a String, is passed as an argument, it is actually
 * a reference to the object that is passed. In this example code, the name variable
 * is a string reference variable. It is passed as an argument to the changeName method.
 * The changeName method has a parameter variable, str, which is also a String
 * reference variable, that receives the argument. Recall that a reference variable
 * holds the memory address of an object. When the changeName method is called,
 * the address that is stored in name is passed into the str parameter variable.
 * This means that when the changeName method is executing, both name and str
 * reference the same object.
 * 
 */

public class PassingObjectReferencesToAMethod
{

    public static void main(String[] args)
    {

        String name = new String("Shakespeare");
        // This statement creates a String object containing "Shakespeare".
        // The "name" variable references the object.

        System.out.println("In main, the name is " + name);
        // This statement displays the String referenced by the name variable.

        changeName(name);
        // This statement calls the "changeName" method, passing the contents of
        // the name variable as an argument.

        System.out.println("Back in main, the name is " + name);
        // This statement displays the String referenced by the "name" variable.
    }

    // The changeName method accepts a String as its argument and assigns the
    // "str" parameter to a new String.
    public static void changeName(String str)
    {
        // Create a String object containing "Dickens".
        // Assign its address to the str parameter variable.
        str = "Dickens";
        // This statement creates a String object containing the word "Dickens".

        // Display the String referenced by str.
        System.out.println("In changeName, the name is now " + str);
        // This statement displays the String referenced by str.
    }

    // Strinq objects in java are immutable, which means that they cannot be
    // changed
}
 
