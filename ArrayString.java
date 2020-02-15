import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
			ArrayList<String> s = new ArrayList<>();
			
			BufferedReader ip = new BufferedReader( new InputStreamReader(System.in));
			
			System.out.println("entrr the no. to get fact of number");
			
			int num = Integer.parseInt(ip.readLine());
			
			while(num != 0)
			{
				String  me = ip.readLine();
				s.add(me);
				num--;
			}
			
			for( String name: s)
			{
				System.out.println(name);
			}
	}

}
