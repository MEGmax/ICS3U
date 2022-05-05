package lessons;

//Format specifiers also have the ability to format
//the values that they correspond to. When displaying numbers,
//the general syntax for writing a format specifier is:
//
//%[flags][width][.precision][conversion]

//There are several optional flags that you can insert into a
//format specifier to cause a value to be formatted in a particular way.
//We will be looking at the following:

//To display numbers with comma separators
//To pad numbers with leading zeros
//To left-justify numbers

public class thePrintFMethod
{
 public static void main(String[] args)
 {
     System.out.println("Example 1: Comma Separators");
     
     // Example 1: Comma Separators
     // Large numbers are easier to read if they are 
     // displayed with comma separators.
     double amount = 1234567.89;
     System.out.printf("%,f\n", amount);     // No rounding
     System.out.printf("%,.2f\n", amount);  // Same number but rounded
     
     
     System.out.println("\nExample 2: Comma Separators");
     
     // Example 2: Comma Separators
     double monthlyPay = 5000.0;
     double annualPay = monthlyPay * 12;
     System.out.printf("Your annual pay is $%,.2f\n", annualPay);
     
     
     System.out.println("\nExample 3: Comma Separators With Integers");
     
     // Example 3: Comma Separators With Integers
     // The following example displays an int with comma separators,
     // with a minimum field width of 10 characters:
     int number = 20000;
     System.out.printf("The number is:%,10d", number);
     
     
     System.out.println("\n\nExample 4: Padding Numbers With Leading Zeros");
     
     // Example 4: Padding Numbers With Leading Zeros
     double numberTwo = 123.4;
     System.out.printf("The number is:%08.1f\n", numberTwo);
     // The 0 in front to the 8 specifies that you want to pad the result
     // with leading zeros.
     
     
     System.out.println("\nExample 5: Left Justfying Numbers");
     
     // Example 5: Left Justifying Numbers
     int num1 = 123;
     int num2 = 12;
     int num3 = 45678;
     int num4 = 456;
     int num5 = 1234567;
     int num6 = 1233;
     
     // Display each variable left-justified
     // in a field of 8 spaces.
     System.out.printf("%-8d%-8d\n", num1, num2);
     System.out.printf("%-8d%-8d\n", num3, num4);
     System.out.printf("%-8d%-8d\n", num5, num6);
     
     
     System.out.println("\nExample 6: Formatting String Arguments");
     
     // Example 6: Formatting String Arguments
     String name1 = "George";
     String name2 = "Franklin";
     String name3 = "Jay";
     String name4 = "Ozzy";
     String name5 = "Carmine";
     String name6 = "Dee";
     
     System.out.printf("%10s%10s\n", name1, name2);
     System.out.printf("%10s%10s\n", name3, name4);
     System.out.printf("%10s%10s\n", name5, name6);
     // The %10s format specifier prints a string in a field that is
     // ten spaces wide. This code displays the values of the variables
     // in a table with three rows and two columns, each column has a
     // width of ten spaces.
     
     // What do you do if you want to left-justify?
     
     
     System.out.println("\nExample 7: Arguments With Different Data Types");
     
     // Example 7: Arguments With Different Data Types
     int hours = 40;
     double pay = hours * 25;
     String name = "Jay";
     
     System.out.printf("Name: %s, Hours: %d, Pay: $%,.2f\n", name, hours, pay);
 }
}