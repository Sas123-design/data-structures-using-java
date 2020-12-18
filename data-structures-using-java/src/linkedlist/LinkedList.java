package linkedlist;

public class LinkedList<T> {

	private Node head;
	private int length;

	public LinkedList() {

	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int getLength() {
		return length;
	}

	public void insertAtFirst(T data) {
		Node node = new Node(data);

		if (isEmpty()) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		length++;

	}

	public void printList() {
		if (isEmpty())
			System.out.println("this list is empty!!!");
		else {
			Node current = head;
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
			System.out.println("length: " + length);
		}
	}

	public void add(T data) {
		Node node = new Node(data);
		if (isEmpty()) {
			head = node;
		} else {
			Node temp = head;
			Node reserve = null;
			while (temp != null) {
				reserve = temp;
				temp = temp.getNext();
			}
			reserve.setNext(node);

		}
		length++;
	}

	public void deleteFirst() {
		if (isEmpty())
			System.out.println("this list is already empty");
		else {
			Node temp = head;
			head = head.getNext();
			temp.setNext(null);
			length--;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			System.out.println("this list is already empty");
		else {
			Node temp = head, reserve = null;
			while (temp.getNext() != null) {
				reserve = temp;
				temp = temp.getNext();
			}
			reserve.setNext(null);
			length--;
		}
	}

	public void delete(int position) {
		if (isEmpty()) {
			System.out.println("this list is already empty");
		}
		else if(position>length) {
			throw new LinkedListOutOfBoundException("position not available!!!");
		}
		else if(position==1) {
			deleteFirst();
		}
		else {
			Node temp = head,reserve=null;
			int count=1;
			while(temp!=null) {
				reserve=temp;
				temp=temp.getNext();
				if(count==position-1) {
					reserve.setNext(temp.getNext());
					temp.setNext(null);
				}
				count++;
			}
			length--;
		}
		
	}
	
	public void reverseList() {
		Node previous = null;
		Node current = head;
		while(current!=null) {
			Node node = current.getNext();
			current.setNext(previous);
			previous = current;
			current = node;
		}
	}
}
