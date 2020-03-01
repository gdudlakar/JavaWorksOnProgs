 class sub{
	public void arrsub(int[] arr,int sum)
	{
		int count = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1 ; j < n ; j++)
			{
				for(int k = j+i+1; k < n; k++)
				{
				if(arr[i]+arr[j] + arr[k]== sum)
				{
					count++;
				}
				}
			}
		}
		System.out.println(count);
	}
}

public class Subary {

	public static void main(String[] args) 
	{
		
		int [] arr = {2,3,2,3,1};
		int sum = 7;
		sub ob = new sub();
		ob.arrsub(arr,sum);
		
	}

}
