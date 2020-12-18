package linkedlist;

public class LinkedListDemo<T> {

	class Node<T> {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}
	}

	Node head = null;
	Node tail = null;
	int size = 0;

	public void add(T data) {
		Node node = new Node(data);

		if (head == null) {
			head = tail = node;
		} else {
			tail.next = node;

		}
		tail = node;
		size++;
	}

	public void display() {
		if (head == null) {
			System.out.println("this list is empty!!!");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println(size);
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("This list is empty!!!");
			return;
		}
		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		tail = current;
		tail.next = null;
		size--;
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("This list is empty!!!");
			return;
		}
		Node temp = head;
		head = temp.next;
		temp.next = null;
		size--;
	}

	public void addFirst(T data) {
		Node node = new Node(data);
		node.next=head;
		head=node;
		size++;
	}
	public void add(T data, int position) {
		int count = 1;
		Node node=null,temp=null;
		Node current = head;
		if (head == null) {
			node=new Node(data);
			head=node;
		}
		else if(position>size) {
			if(position==size+1) {
				add(data);
			}else {
				System.out.println("Not possible!!!");
			}
		}
		else if(position==1) {
			addFirst(data);
		}
		else{
			while (current != null) {
				temp=current;
				current=current.next;
				count++;
				if(position==count) {
					node=new Node(data);
					temp.next=node;
					node.next=current;
				}
			}
			size++;
		}
		
	}

	public static void main(String[] args) {
		LinkedListDemo<String> list = new LinkedListDemo();

		list.add("Jatin");
		list.add("Bhalu");
		list.add("Teddy");
		list.add("Abram");
		list.add("Jonny");
		list.display();
		list.add("Vikas",3);
		list.display();

	}
}
