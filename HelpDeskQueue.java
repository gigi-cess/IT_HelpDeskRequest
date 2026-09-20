package IT_HelpDeskRequest;
import java.util.Scanner;

public class HelpDeskQueue {
	private static String[] queue = new String[5];
	private static int front = 0;
	private static int rear = 0;
	private static int size = 0;

	// ---------- Required Methods ----------
	static boolean isEmpty() {
		return size == 0;
	}

	static boolean isFull() {
		return size == queue.length;
	}

	static void enqueue(String request) {
		if (isFull()) {
			System.out.println("Cannot add request.");
			return;
		}

		queue[rear] = request;
		rear = (rear + 1) % queue.length;
		size++;
		System.out.println("Request added: " + request);
	}

	static String dequeue() {
		if (isEmpty()) {
			System.out.println("Cannot process request.");
			return null;
		}

		String request = queue[front];
		queue[front] = null;
		front = (front + 1) % queue.length;
		size--;
		return request;
	}

	static String peek() {
		if (isEmpty() == true) {
			return null;
		}

		return queue[front];
	}

	static void displayQueue() {
		String currentQueue = "";

		for (int i = 0; i < queue.length; i++) {
			currentQueue += (queue[i] + " ");
			front = (front + 1) % queue.length;
		}

		System.out.println("Current Requests: " + currentQueue);
	}

	static void displayInfo() {
		if (isEmpty() == true) {
			System.out.println("Queue is empty");
		}

		System.out.println("Size: " + size);
		System.out.println("Front: " + front);
		System.out.println("Rear: " + rear);
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

			System.out.print("Enter Option: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.println("----- Add Service Request -----");
					System.out.print("Enter service request: ");
					enqueue(sc.nextLine());
					System.out.println();
					break;
				case 2:
					System.out.println("----- Process Next Request -----");
					String processed = dequeue();
					if (processed != null) {
						System.out.println("Processed: " + processed);
					}
					System.out.println();
					break;
				case 3:
					System.out.println("----- View Next Request -----");
					String next = peek();
					if (next != null) {
						System.out.println("Next request: " + next);
					} else {
						System.out.println("No requests waiting.");
					}
					System.out.println();
					break;
				case 4:
					System.out.println("----- Display Waiting Request -----");
					HelpDeskQueue.displayQueue();
					System.out.println();
					break;
				case 5:
					System.out.println("----- Display Queue Information -----");
					HelpDeskQueue.displayInfo();
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