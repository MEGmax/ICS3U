package lessons;

public class draft1 {

	public static void main(String[] args) 
	{
		int num1 = 99;
		double num2 = 1.5;
		
		System.out.println(num1 + " " + num2);
		myMethod(num1, num2);
		System.out.println(num1 + " " + num2);
		
	}
	
	public static void myMethod(int i , double d)
	{
		System.out.println(i + " " + d);
		i = 0;
		d = 0.0;
		System.out.println(i + " " + d);
	}
	
	

}
