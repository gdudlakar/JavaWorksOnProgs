public class MxMn {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,11111,223222,3333,4,444,-11111,-34,-76};
		
		int larg = a[0];
		int min = a[0];
		
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > larg)
			{
				larg = a[i];
			}
			else 
			{
				min = a[i];
			}
		}
		
		System.out.println("Guru Dudalkar Large element->"+ larg);
		System.out.println("Guru Dudalkar min element->"+ min);
	}

}
