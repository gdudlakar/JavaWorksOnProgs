class nd 
{ 
	int data; 
	nd nextl;
	nd nextr;
}
class list
{
	nd root;
	nd temp;
	public void insert(int data)
	{
		nd node = new nd();
		node.data = data;
		if(root==null)
			root = node;
		temp = root;
		while(temp!=null)
		{
			if(temp.data < data) temp = temp.nextl;
			else
				temp = temp.nextr;
		}
		if(temp.data<data) temp.nextl = root;
		else
			temp.nextl= root;
	}
	public void show(nd node)
	{
		nd temp = root;
		if(temp == null) System.out.println("empty");
		show(node.nextl);
		System.out.println(node.data);
		show(node.nextr);
	}
}