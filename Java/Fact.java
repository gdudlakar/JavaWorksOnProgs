import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class fac
{
	public int fa(int num)
	{
		if(num == 0)
			return 1;
		return num*fa(num-1);
	}
	public int Ifac(int num)
	{
		int fact = 1;
		if(num == 0)
			return 0;
		for( int i = 1; i <= num; i++)
		{
			fact*=i;
		}
		return fact;
	}
}

public class Fact {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		fac f = new fac();
		BufferedReader ip = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("entrr the no. to get fact of number");
		int num = Integer.parseInt(ip.readLine());
		
		System.out.println(f.fa(num));
		System.out.println(f.Ifac(num));
	}

}
