package activites;

public class nestedLoopsAct1 {

	public static void main(String[] args)
	{
		int rows = 7;
		int x;
		int y;

        for(x = rows; x >= 1; --x) 
        {
            for(y = 1; y <= x; ++y) 
            {
                System.out.print("*");
            }
            
            System.out.println();
        }

	}
}