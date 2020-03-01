import java.util.Scanner;

public class PyraEgypt {

	public static void main(String[] args) 
	{
		 /*
		   Scanner ip = new Scanner(System.in);
		System.out.println("entet the height of pyramid");
		int n = ip.nextInt();
		int noc = n-1;
		for(int i =1; i <= n+65; i++)
		{
			for(int k = 1; k<= noc; k++)
			{
				System.out.print("-");
			}
			noc--;
			for(int j=65;j<=(i*2)-1;j++)
			{
				char a = (char)j;
				System.out.print(a+" ");
			}
			System.out.println();
		  */
			/*
			 
		int noofrows,row,coll,col2,noofcol;
		noofrows=5;
		noofcol=noofrows-1;
		
		for(row=1;row<=noofrows;row++)
		{
			for(coll=1;coll<=noofcol;coll++)
			{
				System.out.print("-");
			}
			noofcol--;
			for(col2=1;col2<=row;col2++)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
			
		
	
			 */
		 Scanner ip = new Scanner(System.in);
			System.out.println("entet the height of pyramid");
			int n = ip.nextInt();
		
			        for(int i = n; i >= 0; i--)
			        {
			        	for(int k = 1; k <=n-i;k++)
			        	{
			        		System.out.print(" ");
			        	}
			        	for(int j = i;j<=(i*2)-1;j++)
			        	{
			        		System.out.print("* ");
			        	}
		        	System.out.println();
			        	
			        }
	ip.close();	
		
	}
}
