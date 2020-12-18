package doublylinkedlist;

public class DoublyLinkedListTest {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.display();
	}
}
