import java.util.Arrays;

public class MeegeArray {

	public static void main(String[] args)
	{
		int a[] = {11,5,3,7,8,2,4,0};
		int b[] = {6,9,10,1};
		
		Arrays.sort(a);
		Arrays.sort(b);
		int n = a.length;
		int m = b.length;
		int i = 0;
		int j= 0;
		int k = 0;
		int[] an = new int[m+n];
		while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])
	        {
	            an[k] = a[i];
	            i++;
	        }
	        else
	        {
	            an[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a.length)
	    {
	        an[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < b.length)
	    {
	        an[k] = b[j];
	        j++;
	        k++;
	    }
		for(int g = 0; g < an.length; g++)
		{
			System.out.println(an[g]);
		}
	}

}
