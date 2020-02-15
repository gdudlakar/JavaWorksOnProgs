import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class p
{
	public void IsPrim( int num)
	{
		if (num <= 1)
			System.out.println("not prime ->" +num);
		for(int i = 2; i<num; i++)
		{
			if(i%2 == 0)
				System.out.println(" is not prime ->" + i);
			else
				System.out.println("is prime ->" + i);
		}
		
	}
}

public class Prime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

		int n;
		
		BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no to check whethe it is prme or not");
		n = Integer.parseInt(ip.readLine());
		p Pr = new p();
		Pr.IsPrim(n);
		
	}

}
