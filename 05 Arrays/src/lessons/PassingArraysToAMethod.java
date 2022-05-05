package lessons;
//This program demonstrates passing an array
//as an argument to a method.
import java.util.Scanner;

public class PassingArraysToAMethod
{
  public static void main(String[] args)
  {
      final int ARRAY_SIZE = 4;
      int[] numbers = new int[ARRAY_SIZE];
      getValues(numbers);
      System.out.println("\nHere are the numbers that you entered:");
      showArray(numbers);

  }

  public static void getValues(int[] array)
  {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a series of " + array.length + " numbers.");
      for (int i = 0; i < array.length; i++)
      {
          array[i] = keyboard.nextInt();
      }
  }

  public static void showArray(int[] array)
  {
      for (int i = 0; i < array.length; i++)
      {
          System.out.print(array[i] + " ");
      }

  }
}