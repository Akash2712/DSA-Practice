package Easy;

import java.util.Scanner;

public class Delete_Node_237 {

	public static Node<Integer> input() {
		
		System.out.println("Enter head");
		Scanner sc = new Scanner (System.in);
		
	   Node<Integer> head = null;
	   
	   Node<Integer> tail = null;
		
	   
	   int data = sc.nextInt();
		while(data!=-1) {
			
			Node<Integer> newNode = new Node(data);
			
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
	}
	
	public static Node <Integer>delete(Node <Integer> node , Node<Integer> head) {
		
	
	    
		node.data = node.next.data;
	
		node.next = node.next.next;
	
	    
		return head;
	}
	public static void main(String[] args) {
		
	  Node<Integer> head=input();
	  
	  print(head);
	  
	  Node<Integer> node = new Node(5);
	  head = delete(node,head);
	  
	  System.out.println();
	  print(head);
	}

}
