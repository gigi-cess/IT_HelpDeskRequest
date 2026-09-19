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
		// ToDo: implement
		return null;
	}

	static void displayQueue() {
		// ToDo: implement
	}

	static void displayInfo() {
		// ToDo: implement
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
			System.out.println("1. Add Service Request\n" + "2. Process Next Request\n" + "3. View Next Request\n"
					+ "4. Display Waiting Requests\n" + "5. Display Queue Information\n" + "6. Exit");

			System.out.println("Enter Option: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				/* enqueue */ break;
			case 2:
				/* dequeue */ break;
			case 3:
				/* peek */ break;
			case 4:
				/* displayQueue */ break;
			case 5:
				/* displayInfo */ break;
			case 6:
				System.out.println("Exit Program");
				running = false;
				break;
			default:
				System.out.println("Invalid Input. Try again.");
			}
		}
		sc.close();
	}
}