
public class Rough 
{

	public static void main(String[] args) 
	{
		int n =5;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
				{
				System.out.print("  ");
				}
			for(int k = 1;k<=(2*i-1);k++)
			{
				if(k==1 || k == (2*i-1))
				{
					System.out.print("*");
				}
				else 
					{
					System.out.print(" ");
					}
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--)
		{
			for(int j=i;j<n;j++)
				{
				System.out.print("  ");
				}
			for(int k = 1;k<=(2*i-1);k++)
			{
				if(k==1 || k == (2*i-1))
				{
					System.out.print("*");
				}
				else 
					{
					System.out.print(" ");
					}
			}
			System.out.println();
		}
		 
		
}
}