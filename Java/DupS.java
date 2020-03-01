import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DupS {

	public static void main(String[] args) {
		int count = 0;
		String good = "i am good boy but very good or good or good";
		String s[] =good.split(" ");
		for( String name: s)
		{
			System.out.println(name);
		}
		
		Set<String> Dup = new HashSet<>();
		for( String n: s)
		{
			if(Dup.add(n) == false)
			{
				count++;
				System.out.println("Duplicate value -> " + n + " fcont is -> " +count);
			}
		}
	
	}
}