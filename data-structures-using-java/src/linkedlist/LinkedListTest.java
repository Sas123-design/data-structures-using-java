package linkedlist;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.printList();
		list.reverseList();
		list.printList();
	}
}
