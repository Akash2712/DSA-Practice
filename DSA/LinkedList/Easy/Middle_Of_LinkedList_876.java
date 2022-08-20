package Easy;

import java.util.Scanner;

public class Middle_Of_LinkedList_876 {

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
	
	public static Node middle(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		
		int count =0;
		while(fast!=null) {
			
		//	System.out.println(fast.data);
			
			
			System.out.println("Iteration" +count++);
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	}
	public static void main(String[] args) {
		
	/*	Node head = input();
		
		Node mid = middle(head);
		
		System.out.println(mid.data);*/
		
		
		Node<Integer> temp = new Node(1);
		
		Node<Integer> head = temp.next;
		
		Node<Integer> temp1 = head.next;
		System.out.println(temp1==null);

	}

}
