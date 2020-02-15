package mast;

class Count
{
	int count = 0;
	public synchronized void c()
	{
		count++;
	}
	
	public synchronized void add()
	{
		count = count + 1*4;
	}
	
	public synchronized void sub()
	{
		count = count * 1*4;
	}
}

public  class SYn {

	public static void main(String[] args)  throws Exception
	{
		Count c = new Count();
		
		Thread t = new Thread( new Runnable()
				{
					public void run()
					{
						for(int i = 0; i < 2000; i++)
							c.add();
					}
				}
				);
		Thread t1 = new Thread( new Runnable()
		{
			public void run()
			{
				for(int i = 0; i < 2000; i++)
					c.sub();
			}
		}
		);
		
		t.start();
		t1.start();
		
		t.join();
		t1.join();
		
		System.out.println("Count is" +c.count);
		
		
	}

}
