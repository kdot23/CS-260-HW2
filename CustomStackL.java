/*
 * This class implements the logic of a stack using a linked list
 * 
 */
public class CustomStackL 
{
	private CustomLinkedList l;
	private Node top, bottom;
	
	public CustomStackL()
	{
		l = new CustomLinkedList();
		top = l.getEnd();
		bottom = l.getStart();
	}
	
	/*
	 * This function adds a value to the top of the stack
	 * 
	 * @param data value to be inserted in the stack
	 * 
	 */
	public void push(int data)
	{
		l.insertAtEnd(data);
		if (bottom == null)
		{
			bottom = top = l.getStart();
		}
		else
		{
			top = l.getEnd();
		}
		System.out.println("Operation Push-");
		display();
		
	}
	
	/*
	 * This function removes the value on the top of the stack
	 * 
	 */
	public void pop()
	{
		int end = l.getSize();
		if (end == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		
		l.deleteAtPos(end);
		top = l.getEnd();
		if (l.getStart() == null)
		{
			top = bottom = null;
		}

		System.out.println("Operation Pop-");
		display();
		
	}
	
	public int getSize()
	{
		if (bottom == null)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		return l.getSize();
	}
	
	public void display()
	{
		System.out.println("\nStack\n");
		if (getSize() == -1)
			return;
		
		for (int i = l.getSize(); i > 0; i--)
		{
			Node aNode = bottom;
			for (int j = 1; j < i; j++)
			{
				aNode = aNode.getNext();
			}
			System.out.println(aNode.getData());
		}
		System.out.println( "Top is: " + top.getData());
		System.out.println( "Bottom is: " + bottom.getData());
	}
	
}
