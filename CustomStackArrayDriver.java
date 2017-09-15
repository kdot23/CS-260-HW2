/*
 * /*
 * This class implements the logic of a stack using an array
 */
 
import java.util.Scanner;

public class CustomStackArrayDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Creating an object of class CustomStackArray */
		CustomStackArray q = new CustomStackArray();
		
		/* Perform stack operations */
		while (true)
		{
			System.out.println("\nStack Options\n");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Get Size");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			int choice = scan.nextInt();
			switch (choice)
			{
			case 1: //push
				System.out.println("Enter integer element to insert");
				q.push(scan.nextInt());
				break;
			case 2: //dequeue
				q.pop();
				break;
			case 3: //get size
				System.out.println("Size = " + q.getSize());
				break;
			case 4: //display
				q.display();
				break;			
			case 5: //exit
				scan.close();
				System.exit(0);
			default:
				System.out.println("Wrong Entry \n");
				break;
				
			}
		}	

	}

}
