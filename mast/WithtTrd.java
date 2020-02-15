package mast;

public class WithtTrd {

	public static void main(String[] args) {
	
//		int a = 1000, b = 21;
//		
////		a = a + b;
////		b = a - b;
////		a = a - b;
////		System.out.println("a =-> " + a + " swap b =->" + b);
		
		String  s= "Hanuman";
		String r = " Ram";
		
		s  = s + r;
		
		r = s.substring(0, s.length() - r.length());
		s = s.substring(r.length());
		System.out.println("s =->" + s);
		System.out.println("R =->" + r);
	}

}
