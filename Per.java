

//class Perq
//{
//	
//	public void p(int n)
//	{
//
//	
//}


public class Per {

	public static void main(String[] args) {
//		
//        int n, i = 1, sum = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter any integer you want to check:");
//        n = s.nextInt();
//        while( i < n)
//        {
//        	if( n % i == 0)
//        	sum+=i;
//        	i++;
//        }
//        if(sum == n)
//        {
//            System.out.println("Given number is Perfect");
//        }
//        else
//        {
//            System.out.println("Given number is not Perfect");
//        }    
		
		int sum = 0, i = 1, n = 6;
		while(i < n)
		{
			if(n%i == 0)
			{
				sum+=i;				
			}
			i++;
		}
		if( sum == n)
		{
			System.out.println("it true tht retuns" + sum);
		}
		else
		{
			System.out.println("its not true tht retuns" + sum);
		}
	}
    }
