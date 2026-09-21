package IT_HelpDeskRequest;
import java.util.Scanner;

public class UndoManager {
	private static String[] stack = new String[5];
	private static int top = -1;
	public static String request_history = "";

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
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}

		return stack[top];
	}

	static void displayStack() {
		String currentStack = "";

		for (String i: stack) {
			currentStack += i + " ";
		}

		System.out.println("Current Stack: " + currentStack);
	}

	static void displayInfo() {
		System.out.println("Current Top: " + stack[top]);
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
					String request = sc.nextLine();
					push(request);
					request_history += request;
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
					for (int i = 0; i < request_history.length(); i++) {
						char r = request_history.charAt(i);
						System.out.println("History Request Adding No. " + (i + 1) + ": " + r);
					} 
					System.out.println();
					break;
				case 5:
					System.out.println("----- Display Stack Information -----");
					displayStack();
					displayInfo();
					System.out.println();
					break;
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
