public class Abtc {

	public static void main(String[] args) 
	{
		int a = 0;
		int c = 6;
		int d[] = new int[2];
		
		try
		{
			// c = a/b;
			for (a = 0; a<=c; a++)
			{
				d[a]+=a;
	
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("arrya is exiced ->" +e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println(c);

	}

}
