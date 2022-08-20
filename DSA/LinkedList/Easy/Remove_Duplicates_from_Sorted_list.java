package Easy;

import java.util.*;
// Leetcode 83
public class Remove_Duplicates_from_Sorted_list {

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

public static void print(Node head) {
	
	while(head!=null) {
		
		System.out.print(head.data+" ");
		
		head = head.next;
	}
	
	System.out.println();
}

	public static Node remove(Node head) {
	   
		Node dummy  = new Node(-1);
		
		dummy.next = head;
		
		
		while(head.next!=null) {
			
			if(head.data==head.next.data) {
				// head ko update nhi kiya hai bss linklist ke conncection change kre hai
				// head islye update nhi kiye eg 2,2,2
				
				head.next = head.next.next;
				
			}
			
			else {
				
				// head update krdiya
				head =head.next;
			}
		}
		
		return dummy.next;
	}
	

	public static void main(String[] args) {
	
		Node head = input();
		
		print(head);
		
	head=	remove(head);
		
		print(head);
		
	}

}
