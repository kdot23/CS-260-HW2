import java.util.Scanner;
/*
 * This class is a driver for the stack that implements linked lists
 */

public class CustomStackLDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*Creating object of class CustomStackL */
		CustomStackL s = new CustomStackL();
		
		/*Perform stack operations */
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
				s.push(scan.nextInt());
				break;
			case 2: //dequeue
				s.pop();
				break;
			case 3: //get size
				System.out.println("Size = " + s.getSize());
				break;
			case 4: //display
				s.display();
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
