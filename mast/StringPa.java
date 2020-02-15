package mast;

public class StringPa 
{
	public static void main(String arg[])
	{
		String teacher = "madamu";
		String rev = "";
		 for(int i = teacher.length() -1 ; i >= 0; i--)
		 {
			 rev += teacher.charAt(i);
		 }
		if(teacher.equals(rev))
		{
			System.out.println("Palindrom -> " +rev);
			
		}
		else
			System.out.println("Palindrom  not-> " +teacher);
	}
}
