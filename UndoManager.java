import java.util.Scanner;

public class UndoManager {
	private static String[] stack = new String[5];
	private static int top = -1;

	// ---------- Required Methods ----------
	static boolean isEmpty() {
		return top == -1;
	}

	static boolean isFull() {
		return top == stack.length - 1;
	}

	static void push(String action) {
		if (isFull()) {
			System.out.println("Cannot add request.");
			return;
		}
		top++;
		stack[top] = action;
		System.out.println("Request added: " + action);
	}

	static String pop() {
		if (isEmpty()) {
			System.out.println("Cannot undo request.");
			return null;
		}
		String action = stack[top];
		stack[top] = null;
		top--;
		return action;
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
			System.out.println("----- Choose Option -----\n" + "1. Push Request\n" + "2. Undo Last Request\n"
					+ "3. View Last Request\n" + "4. Display Request History\n" + "5. Display Stack Information\n"
					+ "6. Exit");

			System.out.print("Enter Option: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("----- Push Request -----");
				System.out.print("Enter request: ");
				push(sc.nextLine());
				System.out.println();
				break;
			case 2:
				System.out.println("----- Undo Last Request -----");
				String undone = pop();
				if (undone != null) {
					System.out.println("Undone: " + undone);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("----- View Last Request -----");
				String last = peek();
				if (last != null) {
					System.out.println("Last request: " + last);
				} else {
					System.out.println("No requests to undo.");
				}
				System.out.println();
				break;
			case 4:
				System.out.println("----- Display Request History -----");
				/* displayStack */ break;
			case 5:
				System.out.println("----- Display Stack Information -----");
				/* displayInfo */ break;
			case 6:
				System.out.println("----- Exit Program -----");
				running = false;
				break;
			default:
				System.out.println("Invalid Input. Try again.");
			}
		}
		sc.close();
	}
}
