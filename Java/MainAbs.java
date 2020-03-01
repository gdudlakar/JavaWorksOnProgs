import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  class Gajanan {
//	public  void Ganappa() {
//		System.out.println("ganapati baba morya phudlya varshi lave kan yaaaaa");
//		
//	}
	public void ad() throws IOException
	{
		int a = 0 ,  b = 0, sum = 0;
		BufferedReader ip = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("enter the 1st integer");
		a = Integer.parseInt(ip.readLine());
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("enter the second integer");
		b = Integer.parseInt(in.readLine());
		
		 sum = a + b;
		
		System.out.println("addition of two number is ->:::::: " + sum);
	}
}

public class MainAbs {

	public static void main(String[] args) throws IOException {
		
		
		Abs2 s = new Abs2();
		s.Hy();
		s.MA();
		s.Me();
		s.Show();
		Gajanan G = new Gajanan();
		G.ad();
		s.Ganappa();
	}

}
