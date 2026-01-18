package algo.ds.singlyLinkedList;

public class LinkedList {
	
	public static class Node{
		public String data;
		public Node next;
		
		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	
	public Node getHead() {
		return head;
	}
	
	public Node insert(String value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
			return head;
		}
		
		Node curr = head;
		while(curr.next != null)
			curr = curr.next;
		curr.next = newNode;
		return head;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = head;
		while(temp != null) {
			if(temp.next == null)
				sb.append(temp.data);
			else
				sb.append(temp.data).append("->");
			temp = temp.next;
		}
		return sb.toString();
	}

	public Node delete(String key) {
		if(head == null ||key == null)
			return null;
		
		if(key.equals(head.data)) {
			head = head.next;
			return head;
		}
		
		Node curr = head;
		
		while(curr.next != null && curr.next.data != key)
			curr = curr.next;
		
		if(curr.next != null)
			curr.next = curr.next.next;
		
		return head;
	}
	
	public Node search(String key) {
		Node curr = head;
		if(key == null)
			return null;
		
		while(curr != null) {
			if(key.equals(curr.data))
				return curr;
			curr = curr.next;
		}
		return null;
	}
}
