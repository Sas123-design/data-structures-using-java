package queue;

public class Queue {
	private int front;
	private int rear;
	private int size;
	private int[] queue;
	private static final int INITIAL_CAPACITY=10;
	
	public Queue(int size) {
		queue = new int[INITIAL_CAPACITY];
		front = 0;
		rear = 0;
	}
	
	private boolean isEmpty() {
		return size==0;
	}
	
	public void enQueue(int item) {
		queue[rear]=item;
		size++;
		rear++;
	}
	
	public int deQueue() {
		int item = queue[front];
		front++;
		size--;
		return item;
	}
	
	public void show() {
		System.out.println("elements : ");
		for(int i=front;i<rear;i++) {
			System.out.println(queue[i]);
		}
	}
}
