
public class Pyright {

	public static void main(String[] args) {
		int n = 5;
		int a =1;
		//int noc = n-1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j = 1;j<=i*2-1;j++)
			{
				a =i;
				System.out.print(a+" ");
				
				a++;
				
			}
			//a=1;
			System.out.println();
		}

	}

}
