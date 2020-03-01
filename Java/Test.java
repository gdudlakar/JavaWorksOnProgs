
class Test {

	public static void main(String[] args) {
	
	}

}
abstract class Abc
{
	public void call()
 {
	 System.out.println("calling . . .");
 }
	public abstract void move();
	public abstract void  cook();
	public abstract void dance();
	
}

abstract class Scd extends Abc
{
	public void dance()
	{
		System.out.println(" Gorurur");
		System.out.println("guru dudalkar test");
	}
	
}