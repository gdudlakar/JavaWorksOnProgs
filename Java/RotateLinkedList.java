class Linke
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

	void rotate(int a) 
	{ 
		int count = 1;
		if(a == 0) return;
		Node cur  = head;
		while(count < a && cur != null)
		{
			cur = cur.next;
			count++;
		}
		if(cur == null) return;
		Node pre = cur;
		while(cur.next != null)
			cur = cur.next;
		cur.next = head;
		head = pre.next;
		pre.next=null;
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
public class RotateLinkedList
{
	public static void main(String [] args) 
	{ 
		Linke llist = new Linke(); 
		for (int i=5; i>0; --i) 
		{ 
			llist.push(i+10); 
			
		}
		llist.rotate(5); 
		llist.printList(); 
	} 
}
