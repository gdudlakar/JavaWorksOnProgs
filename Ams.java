public class Ams 
{
	public static void main(String ard[])
	{
		int num = 1530,t = num;
		int rev = 0;
		int sum = 0;
		
		while (num > 0)
		{
			rev = num%10;
			num/=10;
			sum +=(rev*rev*rev);
		}
		if( t == sum)
			System.out.println("Its amtrong");
		else
			System.out.println("not mstr");
			
	}
}
