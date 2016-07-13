package org.test;

class Node1 {
	Node1(int data) {
		this.data = data;
	}
	int data;
	Node1 next;
}

public class ReverseList {

	static Node1 reverse(Node1 head, Node1 previous) {
		if(head == null) {
			return previous;
		}
		Node1 temp = head;
		head = head.next;
		if(head != null) {
			Node1 temp1=head.next;
			head.next = temp;
			temp.next = previous;
			return reverse(temp1, head);
		} else {
			temp.next = previous;
			return reverse(null, temp);
		}
	}
	
	public static void main(String[] args) {
		Node1 n = new Node1(1);
		n.next=new Node1(2);
		n.next.next =new Node1(3);
		Node1 head = reverse(n, null);
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}

 