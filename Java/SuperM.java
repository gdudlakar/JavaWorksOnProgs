


class SuperM
{
	public static void main( String Arg[])
	{
		int s = 123456;
		int rev = 0;
		while( s!= 0)
		{
			rev = rev * 10 + s % 10;
			s /=10;
		}
		System.out.println(">>>>>>>>>>>>    ->" + rev);
		
		int a = 1, b = 10, c = 0;
		c = a%b;
		System.out.println(c);
		
		int nu = 12345;
		
		System.out.println(new StringBuffer(String.valueOf(nu)).reverse());
		
	}
 }