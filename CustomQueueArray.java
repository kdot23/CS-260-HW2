/*
 * This class implements the logic of a queue using an array of a maximum size
 * 
 * Kelsey Lieberman
 * September 13, 2017
 * 
 */
public class CustomQueueArray 
{
	private final int MAX_SIZE = 10;
	private int[] a;
	
	//position in the array of the front and rear of the queue
	private int front, rear; 
	
	public CustomQueueArray()
	{
		a = new int[MAX_SIZE];
		front = rear = -1;
		
	}
	/*
	 * Function that adds data to the end of the queue
	 * @param data is the value to add to the end of the queue
	 */
	public void enqueue(int data)
	{ //assume that the queue never exceeds size of MAX_SIZE
		int p = (rear + 1) % MAX_SIZE;
		a[p] = data;		
		rear = p;
		if (front == -1)
			front++;
		System.out.println("Operation Enqueue-");
		display();
	
	}
	
	/*
	 * Function that removes data from the start of the queue
	 */
	public void dequeue()
	{
		if (front == -1)
		{
			System.out.println("Queue is empty");
			return;
		}
		
		a[front] = 0;
		front = (front + 1) % MAX_SIZE;
		if (a[front] == 0)
			front = rear = -1;
		System.out.println("Operation Dequeue-");
		display();
	} 
	/*
	 * Returns the data that is currently at the start of the queue
	 */
	public int peek() //return -1 in case Queue is empty
	{
		if (front == -1)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		return a[front];
	}
	
	
	public boolean isEmpty()
	{
		return front == -1;
	}
	
	public int getSize() //-1 indicates that the queue is empty
	{
		if (front == -1)
		{
			System.out.println("Queue is empty");
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
		System.out.print("\nQueue = ");
		if (isEmpty())
		{
			System.out.print("empty\n");
			return;
		}
		
		System.out.print(a[front]);
		int p = (front + 1) % MAX_SIZE;
		while (a[p] != 0 && p != front)
		{
			System.out.print(" <- " + a[p]);
			p = (p+1) % MAX_SIZE;
		}
		

		System.out.println("\nFront is: " + a[front]);
		System.out.println("Rear is: " + a[rear]);
	}

}
