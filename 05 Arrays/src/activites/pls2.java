package activites;

public class pls2 {

	public static void main(String[] args) 
	{
		int []list = {-6, 25, 118, 10, 7};
		
		for (int i = 0; i < list.length; i++)
		{
			list[i] = list[i] + (list[i] / list[0]);
		}
		
		for (int i = 0;  i < list.length; i++)
		{
			System.out.println(list[i] + " ");
		}

	}

}
