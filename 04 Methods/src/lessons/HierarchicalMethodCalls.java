package lessons;
/*
 * Methods can also be called in a hierarchical, or layered fashion. 
 * In other words, method A can call method B, which can then call
 * method C. When method C finishes, the JVM returns to method B.
 * When method B finishes, the JVM returns to method A.
 * 
 * The program below demonstrates this with three methods: main, levelOne, and levelTwo.
 * The main method calls the levelOne method, which then calls the levelTwo
 * method.
 */

// This program demonstrates hierarchical method calls.

public class HierarchicalMethodCalls
{

    public static void main(String[] args)
    {
        System.out.println("l am starting in main.");
        levelOne();
        System.out.println("Now I am back in main.");
    }

    // The levelOne method displays a message and then
    // calls the levelTwo method.

    public static void levelOne()
    {
        System.out.println("l am now in levelOne.");
        levelTwo();
        System.out.println("Now I am back in levelOne.");
    }

    // The levelTwo method simply displays a message.

    public static void levelTwo()
    {
        System.out.println("I am now in levelTwo.");
    }

}

// You should always document a method by writing comments that
// appear just before the method's definition. The comments should
// provide a brief explanation of the method's purpose.
 