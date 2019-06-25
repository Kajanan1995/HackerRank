import java.util.Scanner;
import java.util.Stack;


//Here Enqueue is costly
public class TwoStackForImplementingQueue {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();

	public void enQueue(int x) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	public void deQueue() {
		if (!s1.isEmpty()) {
			s1.pop();
		}
	}

	public void printFront() {
		System.out.println(s1.peek());
	}

	public static void main(String[] args) {
		TwoStackForImplementingQueue que = new TwoStackForImplementingQueue();
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		for (int i = 0; i < time; i++) {
			int selection = scan.nextInt();
			switch (selection) {
			case 1:
				que.enQueue(scan.nextInt());
				break;
			case 2:
				que.deQueue();
				break;
			case 3:
				que.printFront();
				break;
			}
		}
	}
}
