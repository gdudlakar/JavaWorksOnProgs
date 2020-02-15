

class Link4
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
		Node cur = head; 
		Node pre = null;
		Node nxt = null;
		while(cur != null)
		{
			nxt = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nxt;
		}
		head = pre;
		
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
public class Binary_Tree
{
	public static void main(String [] args) 
	{ 
		Link4 llist = new Link4(); 
		for (int i=5; i>0; --i) 
		{ 
			llist.push(i+10); 
			
		}
		llist.reverse(); 
		llist.printList(); 
	} 
}

/*import Link.Node;

public class Binary_Tree { 
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
       
    public void insert(int value) {
    	Node node = head;
        if (value < node.value)
        { 
        	if (node.left != null) 
        	{ insert(node.left, value); 
        	} 
        	else 
        	{ System.out.println(" Inserted " + value + " to left of " + node.value);
        	node.left = new Node(value); 
        	}
        	}
        else if (value > node.value) 
        {
          if (node.right != null) 
          {
            insert(node.right, value);
          } else 
          {
            System.out.println("  Inserted " + value + " to right of "
                + node.value);
            node.right = new Node(value);
          }
        }
      }
     public void traverseInOrder(Node node)
     {
    	 
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }
     
     public static void main(String args[]) 
    { 
    Binary_Tree tree = new Binary_Tree();
                Node root = new Node(5);
                System.out.println("Binary Tree Example");
                System.out.println("Building tree with root value " + root.value);
                tree.insert(root, 2);
                tree.insert(root, 4);
                tree.insert(root, 8);
                tree.insert(root, 6);
                tree.insert(root, 7);
                tree.insert(root, 3);
                tree.insert(root, 9);
                System.out.println("Traversing tree in order");
                tree.traverseInOrder(head);
                
              }
}*/