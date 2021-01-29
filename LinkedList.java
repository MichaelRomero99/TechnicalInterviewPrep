
public class LinkedList {
	Node head;
	Node tail;
	public LinkedList() {
		head = new Node(-1);
		tail = new Node(-1);
		head.next = tail;
		tail.prev = head;
	}
	public void add(int val) {
		Node curr = head;
		Node prev = null;
		while(curr != tail) {
			prev = curr;
			curr = curr.next;
			
		}
		Node node = new Node(val);
		prev.next = node;
		node.next = curr;
		curr.prev = node;
		node.prev = prev;
	
	}
	public void remove(int val) {
		Node curr = head;
		Node prev = null;
		while(curr != tail && curr.val != val) {
			prev = curr;
			curr = curr.next;
		}
		if(curr == tail) {
			System.out.println("Value not found");
		}else {
			Node next = curr.next;
			prev.next = curr.next;
			next.prev = prev;
		}
	}
	public void print() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.val+ ",");
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(2);
		list.remove(3);
		list.remove(4);
		list.print();
	}
	public class Node{
		int val;
		Node next;
		Node prev;
		public Node(int val) {
			this.val = val;
		}
	}
}
