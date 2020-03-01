import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("String s1");
		s1 = sc.nextLine();
		System.out.println("String s2");
		s2 = sc.nextLine();
		System.out.println(s1.concat(s2));
		sc.close();
	}

}
