import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("entet the height of pyramid");
		int n = ip.nextInt();
		int coef=1;
		for(int i = 0; i < n;i++)
		{
			for(int k =1;k<n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0||i==0) coef=1;
				else
					coef = coef*(i-j+1)/j;
				System.out.printf("%4d", coef);
			}
			System.out.println();
		}
ip.close();
}
}
