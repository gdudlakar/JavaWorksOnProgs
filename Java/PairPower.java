
public class PairPower {

	public static void main(String[] args) {
		int [] arr = {2,3,2,3,1};
		int [] a = {2,3,2,3,1};
		int count = 0;
		
		for( int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length;j++)
			{
				if(Math.pow(arr[j], a[i]) > Math.pow(a[i], arr[j]))
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
