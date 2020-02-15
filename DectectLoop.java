import java.util.HashSet;

class Link1
{
	Node head; 
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

	void reverse() 
	{ 
		System.out.println("hello");
		boolean flag = false;
		Node h = head;
		HashSet<Node> s = new HashSet<Node>();
		while( h != null)
		{
			if(s.contains(h))
				flag = true;
			s.add(h);
		}
		if(flag == true)
			System.out.println("found the loop");
		else
			System.out.println("Loop not found");

		System.out.println("hello");
	} 

	
	public void push(int new_data) 
	{ 
		
		Node new_node = new Node(new_data); 

	
		new_node.next = head; 

		
		head = new_node; 
	} 

	
	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+"->"); 
			tnode = tnode.next; 
		} 
		System.out.println("NULL"); 
	} 
}
public class DectectLoop
{
	public static void main(String [] args) 
	{ 
		Link1 llist = new Link1(); 
		for (int i=5; i>0; --i) 
		{ 
			llist.push(i+10); 
			
		}
		llist.reverse(); 
		//llist.printList(); 
	} 
}

