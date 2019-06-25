import java.util.PriorityQueue;
import java.util.Scanner;

public class QHeap {
	static PriorityQueue<Integer> que = new PriorityQueue<Integer>();

	public void addElement(int x) {
		que.add(x);
	}

	public void deleteElement(int y) {
		que.remove(y);
	}

	public void printMinimum() {
		int min = que.poll();
		que.add(min);
		System.out.println(min);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		QHeap que = new QHeap();

		int time = scan.nextInt();

		for (int i = 0; i < time; i++) {
			int option = scan.nextInt();
			switch (option) {
			case 1:
				que.addElement(scan.nextInt());
				break;
			case 2:
				que.deleteElement(scan.nextInt());
				break;
			case 3:
				que.printMinimum();
				break;
			}
		}
	}
}
