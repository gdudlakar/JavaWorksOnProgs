import java.util.Scanner;

public class Abcpyramid {

	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
		System.out.println("entet the height of pyramid");
		int n = ip.nextInt();
		for(int i = 65; i <= (65+n); i++)
		{
			for( int j=65;j<=i;j++)
			{
				char a = (char)j;
				System.out.print(a+" ");
			}
			System.out.println();
		}
	ip.close();	
	}

}
