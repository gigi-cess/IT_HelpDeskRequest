package IT_HelpDeskRequest;
import java.util.Scanner;

public class UndoManager {
	// ---------- Stack ----------
	private static String[] stack = new String[5];
	private static int top = -1;

	// ---------- Required Methods ----------
	static boolean isEmpty() {
		// ToDo: implement
		return false;
	}

	static boolean isFull() {
		// ToDo: implement
		return false;
	}

	static void push(String action) {
		// ToDo: implement
	}

	static String pop() {
		// ToDo: implement
		return null;
	}

	static String peek() {
		// ToDo: implement
		return null;
	}

	static void displayStack() {
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
		System.out.println("UNDO MANAGER");
		System.out.println("================================");

		while (running) {
			System.out.println("1. Push Request\n" + "2. Undo Last Request\n" + "3. View Last Request\n"
					+ "4. Display Request History\n" + "5. Display Stack Information\n" + "6. Exit");

			System.out.println("Enter Option: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				/* push */ break;
			case 2:
				/* pop */ break;
			case 3:
				/* peek */ break;
			case 4:
				/* displayStack */ break;
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
