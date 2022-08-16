package Easy;

import java.util.*;
public class Practicee {

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
			
			head= head.next;
		}
	}
	public static void main(String[] args) {
		
  Node head =		input();
		
  print(head);
		
		

	}

}
