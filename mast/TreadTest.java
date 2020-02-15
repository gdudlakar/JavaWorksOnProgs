package mast;

class T implements Runnable
{
	public void run()
	{
		for(int i = 0; i< 10; i++)
		{
			System.out.println("Hanuman");
			try {Thread.sleep(1000);}catch(Exception e) {}
			
		}
	}
}
	
	class D implements Runnable
	{
		public void run()
		{
			for(int i = 0; i< 10; i++)
			{
				System.out.println("Ram");
				try {Thread.sleep(1000);}catch(Exception e) {}
				
			}
		}
	}
		
	public class TreadTest {
		public static void main(String arg[]) throws Exception
		{			
			
			Thread t3 = new Thread(()->
			{
				for(int i = 0; i< 5; i++)
				{
					System.out.println("Hanuman");
					try {Thread.sleep(1000);}catch(Exception e) {}
					
				}
				});
			Thread t4 = new Thread(()->
			{
				for(int i = 0; i< 5; i++)
				{
					System.out.println("Ram");
					try {Thread.sleep(1000);}catch(Exception e) {}
					
				}
			});
			
			t3.setPriority(Thread.MAX_PRIORITY);
			t4.setPriority(Thread.MIN_PRIORITY);
			
			System.out.println(t3.getPriority());
			System.out.println(t4.getPriority());
			
			t3.setName("Sita");
			t4.setName("lakshman");
			System.out.println(t3.getName());
			System.out.println(t4.getName());
			
			
			t3.start();
			t4.start();
			
			t3.join();
			t4.join();
			
			System.out.println("JAI RAM SHREE RAM JAI JAI RAM");
		}
	}



