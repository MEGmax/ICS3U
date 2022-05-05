package lessons;
/*
 * This program demonstrates a method that returns a reference to a String object.
 */

public class ReturnString
{

    public static void main(String[] args)
    {
        String customerName;

        customerName = fullName("John", "Martin");
        // This line calls the fullName method, passing "John" and
        // "Martin" as arguments. The method returns a reference to a
        // String object containing "John Martin". The reference is
        // assigned to the customerName variable.

        System.out.println(customerName);
        // This line prints the contents of the customerName variable
    }

    /*
     * The fullName method accepts two String arguments containing a first and
     * last name. It concatenates them into a single String object.
     */

    public static String fullName(String first, String last)
    {
        String name;
        name = first + " " + last;
        return name;
    }
}