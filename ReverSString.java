
public class ReverSString {

	public static void main(String[] args) {
		String str = "guruisguru";
		char ch,cs;
		int l = str.length(),ct;
		for(cs = 'a'; cs <= 'z';cs++)
		{
			ct = 0;
			for(int i = 0; i <l;i++)
			{
				ch = str.charAt(i);
				
				if(cs == ch)
				{
					ct++;
				}
			}
			if(ct!=0)
			{
				System.out.println( cs +" count is "+ ct);
			}
		}


	}

}