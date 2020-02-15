import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class SingleLink
{
	Node head;
	
	public void insert(int data) throws NumberFormatException, IOException
	{
		
		int item;
		
		System.out.println("enter the pos to insert -> " );
		BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
		
		item = Integer.parseInt(ip.readLine());
		
		
		Node ne = new Node(data);
		
		
		if( head == null)
		{
			head = ne;
		}
		else
			
		{Node n;
		n = head;
		
		while( n.data != item)
		{
			n = n.next;
		}
		ne.next = n.next;
		n .next = ne;
		
	}}
	
	public void show()
	{
		Node n = head;
		
		if(head == null)
		{
			System.out.println("No item to display");
		}
		
		while( n.next != null)
		{
			System.out.println("Item in the Linked list is -> " +n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
public class Linked {

	public static void main(String[] args)  throws Exception
	{
		SingleLink l = new SingleLink();
		
		l.insert(45);
		l.insert(21);
		l.insert(4);
		l.insert(1);
		l.insert(5);
		l.insert(121);
		
		l.show();

	}

}
