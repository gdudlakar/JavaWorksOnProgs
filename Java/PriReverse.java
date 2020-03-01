public class PriReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12399,rev = 0;
		
//		System.out.println(new StringBuffer(String.valueOf(a).reverse));
		
		
		while( num != 0 )
		{
			rev = rev*10+num%10;
			num /=10;
		}
		System.out.println(rev);
	}

}
