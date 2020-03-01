import java.util.Scanner;

public class Pyramid
{
	public static void main(String[] args)
	{
		 Scanner ip = new Scanner(System.in);
		System.out.println("entet the height of pyramid");
		int n = ip.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for( int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	ip.close();	
	}
}
