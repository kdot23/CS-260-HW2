/*
 * This class implements the logic of a stack using an
 * int array with a maximum size
 * 
 */
public class CustomStackArray {

	private int[] a;
	private int top, bottom; //values of the top and bottom of the stack
	private final int MAX_SIZE = 10; //max size of the array
	
	public CustomStackArray()
	{
		a = new int[MAX_SIZE];
		top = bottom = -1;	//set the top and bottom equal to -1 when empty	
	}
	
	/*
	 * This function adds a value to the top of the stack
	 * 
	 * @param data value to be inserted in the stack
	 * 
	 */
	public void push(int data)
	{
		int p = (top + 1) % MAX_SIZE;
		a[p] = data;
		top = p;
		if (bottom == -1)
			bottom++;
		System.out.println("Operation Push-");
		display();	
	}
	
	/*
	 * This function removes the value on the top of the stack
	 * 
	 */
	public void pop()
	{
		if (top == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		a[top] = 0;
		top = (top+MAX_SIZE - 1) % MAX_SIZE;
		if (a[top] == 0 || a == null)
			top = bottom = -1;
		System.out.println("Operation Pop");
		display();
	}
	
	public int getSize()
	{
		if (top == -1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		int size = 0;
		for (int i=0; i < MAX_SIZE; i++)
		{
			if (a[i] != 0)
				size++;
		}
		return size;
	}
	
	public void display()
	{
		System.out.println("\nStack:\n");
		if (getSize() == -1)
		{
			System.out.print("empty\n");
			return;
		}
		
		System.out.println(a[top]);
		int p = (top + MAX_SIZE - 1) % MAX_SIZE;
		while (a[p] != 0 && p != top)
		{
			System.out.println(a[p]);
			p = (p + MAX_SIZE - 1) %MAX_SIZE;
		}

	}
}
