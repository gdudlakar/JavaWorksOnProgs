
public class MaxMInAlternate {

	public static void main(String[] args)
	{
		
		int a[] = {1,2,3};
		int re[] = new int[a.length];
		int last = a.length - 1;
		int j = 0;
		boolean flag = true;
		for(int i = 0; i < a.length;i++)
		{
			if(flag)
			{
				re[i] = a[last--];
			}
			else
			{
				re[i] = a[j++];
			}
			flag = !flag;
		}
		for(int g = 0; g < re.length; g++  )
		{
			System.out.println(re[g]);
		}

	}

}
