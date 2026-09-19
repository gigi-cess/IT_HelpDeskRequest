package IT_HelpDeskRequest;
import java.util.Scanner;

public class HelpDeskQueue {
	// ---------- Queue ----------
	private static String[] queue = new String[5];
	private static int front = 0;
	private static int rear = 0;
	private static int size = 0;

	// ---------- Required Methods ----------
	static boolean isEmpty() {
		// ToDo: implement
		return false;
	}

	static boolean isFull() {
		// ToDo: implement
		return false;
	}

	static void enqueue(String request) {
		// ToDo: implement
	}

	static String dequeue() {
		// ToDo: implement
		return null;
	}

	static String peek() {
		if (isEmpty() == true) {
			return null;
		}

		return queue[front];
	}

	static void displayQueue() {
		String currentQueue = "";

		for(int i = 0; i < queue.length; i++) {
			currentQueue += queue[i];
			front = (front + 1) % queue.length;
		}

		System.out.println("Current Requests: " + currentQueue);
	}

	static void displayInfo() {
		if (isEmpty() == true) {
			System.out.println("Queue is empty");
		}

		for(int i = 0; i < queue.length; i++) {
			System.out.println("No. " + (i + 1) + " in the queue: " + queue[front]);
			front = (front + 1) % queue.length;
		}
	}

	// ---------- Main Class ----------
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		int choice;

		System.out.println("================================");
		System.out.println("IT HELP DESK QUEUE");
		System.out.println("================================");

		while (running) {
			System.out.println(
				"1. Add Service Request\n" + 	   
				"2. Process Next Request\n" + 
				"3. View Next Request\n" + 
				"4. Display Waiting Requests\n" + 
				"5. Display Queue Information\n" + 
				"6. Exit"
			);

			System.out.print("Enter Option: ");
			choice = sc.nextInt();
			sc.nextLine();

			if (HelpDeskQueue.isEmpty() == true) {
					System.out.println();
					System.out.println("Queue is empty");
			} else {
				switch (choice) {
				case 1:
					/* enqueue */ break;
				case 2:
					/* dequeue */ break;
				case 3:
					System.out.println();
					System.out.println("Next Request: " + HelpDeskQueue.peek());
					System.out.println();
					break;
				case 4:
					System.out.println();
					HelpDeskQueue.displayQueue();
					System.out.println();
					break;
				case 5:
					System.out.println();
					HelpDeskQueue.displayInfo();
					System.out.println();
					break;
				case 6:
					System.out.println("Exit Program" + "\n");
					running = false;
					break;
				default:
					System.out.println("Invalid Input. Try again.");
				}
			}
		}
		sc.close();
	}
}