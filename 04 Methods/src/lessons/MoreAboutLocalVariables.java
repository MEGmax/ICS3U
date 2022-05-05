package lessons;
/*
 * A local variable is declared inside a method and is not
 * accessible to statements outside the method. Different methods
 * can have local variables with the same names because the methods
 * cannot see each other's local variables.
 */

// This program demonstrates that two methods may have local variables with the lame name.

public class MoreAboutLocalVariables
{

    public static void main(String[] args)
    {
        texas();
        california();
    }

    // The Texas method has a local variable named birds.

    public static void texas()
    {
        int birds = 5000;
        System.out.println("In texas there are " + birds + " birds.");
    }

    // The California method also has a local variable named birds

    public static void california()
    {
        int birds = 3500;
        System.out.println("In California there are " + birds + " birds.");
    }

}

/*
 * Although there are two variables named birds, the program can see only one of
 * them at a time because they are in different methods. When the texas method
 * is executing, the birds variable declared inside texas is visible. When the
 * California method is executing, the birds variable declared inside California
 * is visible.
 */
 