class Pa
{
public void Pal(int num)
{
	int rev = 0;
	int t =num;
	
	while (t > 0)
	{
		rev = rev*10 + t%10;
		t/=10;
	}
	if(num == rev)
		System.out.println(" palindrom");
	else
			System.out.println("not palindron");
	
}
}

public class Palindrome {
	
	public static void main(String[] args) {
		Pa p = new Pa();
		p.Pal(121);
	}

}
