public class ReAr {

	public static void main(String[] args) {
		
		  int a[]=new int[9];
		  int nums[] = {1,2,3,4,5};
		  int j = 0;
		
		  
		  for( int i = 4; i >= 0; i--)
		  {
		    a[j]=nums[i];
		    j++;
		  }
		  
		  for( int i = 0; i < 5; i++)
		  {
			  System.out.println(nums[i]);

		  }
		  
		  for( int i= 0; i <5; i++)
		  {
			  System.out.println(a[i]);

		  }

	}

}
