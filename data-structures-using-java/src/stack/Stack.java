package stack;

public class Stack {
	private int stack[];
	private int size;

	private static final int INITIAL_CAPACITY = 10;

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Stack(int size) {
		this.stack = new int[INITIAL_CAPACITY];
		size = 0;
	}

	private boolean isEmpty() {
		return size == 0;
	}

	public void push(int item) {
		if (size == INITIAL_CAPACITY) {
			doubleCapacity();
		}
		stack[size] = item;
		size++;
	}

	public int pop() {
		if (isEmpty())
			return 0;
		else {
			int result = stack[size - 1];
			size--;
			return result;
		}
	}

	private void doubleCapacity() {
		int[] newArray = new int[2 * INITIAL_CAPACITY];
		for (int i = 0; i < size; i++) {
			newArray[i] = stack[i];
		}
		stack = newArray;
	}
}
