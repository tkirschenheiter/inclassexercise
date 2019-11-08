import java.util.*;


public class genericStack <E> {
	Node head;
	
	genericStack() {
		head = null;
	}
	
	class Node {
		String val;
		Node next;

		Node(String val2) {
			this.val = val2;
		}
	}
	
	public void push(String val) {
		if (head == null) {
			head = new Node(val);
			
		} else {
			Node newhead = new Node(val);
			newhead.next = head;
			head = newhead;
			 
		}
	}
	
	public String pop(String string) {
		if (head == null)
			return null;
		else {
			String popval = head.val;
			head = head.next;
			return popval;
		}
	}
	
	public genericStack<E>.Node peek() {
		if (head == null)
			return null;
		else {
			return head;
		}
	}
	
	public int size() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	


}
