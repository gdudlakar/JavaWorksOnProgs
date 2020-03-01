import java.util.HashSet;
import java.util.Set;

public class Duplicate
{
	public static void main(String arg[])
	{
		int s[] = {1,2,3,4,5,5,2,6,81,1};
		
		for(int i = 0; i< s.length - 1; i++)
		{
			for( int j = i + 1; j< s.length ; j++)
			{
				if(s[i] == (s[j]))
				{
					System.out.println(s[i]);
				}
			}
		}
		
		
		System.out.println("********************************************");
		System.out.println("\n\n\n");
		
		Set<Integer> m = new HashSet<>();
		for( int name: s)
		{
			if(m.add(name) == false)
			{
				System.out.println("Hre we dound the duplicate value -> "+ name);
			}
		}
		
	}
}
