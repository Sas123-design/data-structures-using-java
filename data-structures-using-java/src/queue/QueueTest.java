package queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new Queue(3);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.show();
		queue.deQueue();
		queue.show();
	}
}
