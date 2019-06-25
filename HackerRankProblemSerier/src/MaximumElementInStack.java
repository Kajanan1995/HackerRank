import java.util.Scanner;

public class MaximumElementInStack {
	Scanner scan = new Scanner(System.in);
	int top = 0;
	int cap = 1000;
	int stack[] = new int[cap];
	int size = 0;

	public void push(int data) {
		stack[top] = data;
		size++;
		top++;
	}

	public void pop() {
		top--;
		stack[top] = 0;
		size--;
	}

	public void printStack() {
		for (int k : stack) {
			System.out.print(k + " ");
		}
	}

	public void maximum() {
		int max = 0;
		for (int k : stack) {
			if (k != 0 && k > max) {
				max = k;
			} else if (k == 0) {
				break;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		MaximumElementInStack obj = new MaximumElementInStack();
		int time = scan.nextInt();
		for (int i = 0; i < time; i++) {

			int option = scan.nextInt();

			switch (option) {
			case 1:
				obj.push(scan.nextInt());
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.maximum();
				break;
			}
		}

	}

}
