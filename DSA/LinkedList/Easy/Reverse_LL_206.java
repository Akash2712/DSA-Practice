package Easy;

import java.util.Scanner;

public class Reverse_LL_206 {

	public static Node input() {
		
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
	
	
	public static Node reverse(Node head) {
		
		
		Node current  = head;
		
		Node prev = null;
		
		Node next = null;
		
		
		while(current!=null) {
			
			next = current.next;
			
			current.next = prev;
			
			prev = current;
			current = next;
		}
		
		
		
		return prev;
	}
	public static void main(String[] args) {
		

		Node head = input();
		
		print(head);
		
		head = reverse(head);
		
		print(head);
		
	
	}

}
