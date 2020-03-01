public class MIssing {
	public static void main(String arg[])
	{
		int a[] = {1,2,4,5,6};
		int n = a.length;
		
		int total = 0;
		int min = 0;
		
		total = ((n+1)*(n+2)/2);
		
		for ( int i = 0; i<=a.length; i++)
		{
			total= a[i];
			//System.out.println(i);
			//System.out.println(min);
		}
		
		//total -= min;
		System.out.println(total);
		
	}

}
