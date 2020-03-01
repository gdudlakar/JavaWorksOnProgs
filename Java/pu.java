import java.util.Scanner;

public class pu {

	private static Scanner s;
	

	public static void main(String[] args) 
	{
		
		int a,b;
		s = new Scanner(System.in);
		System.out.print("Enter any integer 1st:");
		a = s.nextInt();
		System.out.print("Enter any integer 2nd:");
		b = s.nextInt();
		  int aDiff = Math.abs(a - 10);
		  int bDiff = Math.abs(b - 10);
		  System.out.println("a -> " +Math.abs(a - 10));
		  System.out.println("b-> " +Math.abs(b - 10));
		  if (aDiff < bDiff) {
		    System.out.println(a);
		  }
		  
		  if (bDiff < aDiff) {
		    System.out.println(b);
		  }
		  System.out.println("0");
	}

}
