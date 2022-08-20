package Easy;

import java.util.Scanner;
import java.util.*;
public class Delete_Nth_Node_from_end {

public static Node delete(Node head , int k) {
	
	Node dummy = new Node(-1);
	
	dummy.next = head;
	
	Node slow = dummy;
	Node fast = dummy;
	
	
	for(int i=0;i<k;i++) {
		
		fast = fast.next;
	}
	
	while(fast.next!=null) {
		
		slow = slow.next;
		fast = fast.next;
	}
	
	Node Deleted = slow.next;
	
	LinkedList<Integer> li = new LinkedList<>();
	
	
	System.out.println("Del " + Deleted.data);
	
	slow.next = slow.next.next;
	
	return dummy.next;
	
}

public static void print(Node head) {
	
	
	while(head!=null) {
		
		System.out.print(head.data+" ");
		
		head = head.next;
	}
}
public static Node input() {
		
		System.out.println("Enter head");
		Scanner sc = new Scanner (System.in);
		
	   Node head = null;
	   
	   Node tail = null;
		
	   
	   int data = sc.nextInt();
		while(data!=-1) {
			
			Node newNode = new Node(data);
			
			if(head==null) {
				head = newNode;
				tail =newNode;
			}
			else {
				
				tail.next = newNode;
				
				tail = tail.next;
			}
			
			data = sc.nextInt();
		}
		
		
		return head;
	}

	public static void main(String[] args) {
		
		Node head = input();
		
		int k =2;
		
		print(head);
		
		head = delete(head,k);
		
		System.out.println();
		print(head);
		
		

	}

}
