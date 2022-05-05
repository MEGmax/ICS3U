package lessons;

import java.util.Scanner;

//This program uses a while loop to write a program that assists a
//technician in the process of checking a substance's temperature.

public class lessons3
{
public static void main(String[] args)
{
   // Create a final double type variable to hold the maximum temperature
   final double MAX_TEMP = 102.5;

   // To hold the temperature entered by the user. This variable also
   // acts as the control variable.
   double temperature;
   
   // Create a Scanner object for keyboard input.
   Scanner keyboard = new Scanner(System.in);
   
   // Prompt the user for the current temperature.
   System.out.print("Enter the substance's Celsius temperature: ");

   // This statement assigns the user's input to the variable "temperature"
   temperature = keyboard.nextDouble();
   
   // This while loop checks if the temperature entered by the user is greater
   // than MAX_TEMP, if true, then run the block of code.
   while (temperature > MAX_TEMP)
   {
      System.out.println("The temperature is too high. Turn the");
      System.out.println("thermostat down and wait 5 minutes.");
      System.out.println("Then, take the Celsius temperature again");
      System.out.print("and enter it here: ");

      // This statement allows the user to enter a new temperature, once
      // entered, it will test the new temperature to MAX_TEMP once again,
      // if true, the loop will run again, if false, the loop will stop.
      temperature = keyboard.nextDouble();
   }
   
   // Remind the technician to check the temperature again in 15 minutes.
   System.out.println("The temperature is acceptable.");
   System.out.println("Check it again in 15 minutes.");
}
}

