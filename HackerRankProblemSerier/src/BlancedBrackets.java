import java.util.Scanner;

public class BlancedBrackets {
	Node head;

	class Node {
		char data;
		Node next;

		Node(char n) {
			data = n;
			next = null;
		}
	}

	public void deleteStack() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void push(char str) {
		Node newnode = new Node(str);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void pop() {
		if (head != null) {
			head = head.next;
		} else {
			System.out.println("NO");
			return;
		}
	}

	public void stack(String word) {
		if (word.length() % 2 != 0) {
			System.out.println("NO");
			return;
		}
		if (head == null && (word.charAt(0) == '}' || word.charAt(0) == ']' || word.charAt(0) == ']')) {
			System.out.println("NO");
			return;
		}

		for (char str : word.toCharArray()) {
			Node newnode = new Node(str);
			if (str == '{' || str == '[' || str == '(') {
				push(str);
			} else if (head!=null && ((str == '}' && head.data == '{') || (str == ']' && head.data == '[')
					|| (str == ')' && head.data == '('))) {

				pop();

			}

			else {
				push('a');
			}
		}

		if (head == null)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	public static void main(String[] args) {
		BlancedBrackets stac = new BlancedBrackets();
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		for (int i = 0; i < time; i++) {
			stac.stack(sc.next());
			stac.deleteStack();
		}

	}

}
