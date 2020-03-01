import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReverSString {

	public static void main(String[] args) {
		String str = new String("gurururu");
		// char ch,cs;
		// int l = str.length(),ct;
		// for(cs = 'A'; cs <= 'Z';cs++)
		// {
		// 	ct = 0;
		// 	for(int i = 0; i <l;i++)
		// 	{
		// 		ch = str.charAt(i);
				
		// 		if(cs == ch)
		// 		{
		// 			ct++;
		// 		}
		// 	}
		// 	if(ct!=0)
		// 	{
		// 		System.out.println( cs +" count is "+ ct);
		// 	}
		// }
			Map<Character,Integer> nr = new HashMap<>();

		for(char a:str.toCharArray())
		{
			if(nr.containsKey(a))
			{
				nr.put(a, nr.get(a)+1);
			}
			else
			nr.put(a, 1);
		}
		Set<Map.Entry<Character,Integer>> cv = nr.entrySet();
		for(Map.Entry<Character,Integer> x : cv) {System.out.println(x.getKey() + " " + x.getValue());}
	}

}
