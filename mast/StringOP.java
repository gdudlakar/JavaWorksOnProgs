package mast;

public class StringOP 
{
	public static void main( String arg[])
	{
		String s = "Jai Ram Shree Ram Jai Jai Ram";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf("R"));
		System.out.println(s.concat("Hanuman"));
		System.out.println(s.indexOf("R", 15));
	}
}
