package Easy;

import java.util.Scanner;

public class Print_kth_Node_From_End {

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
	
public static Node kth(Node head , int k) {
	
	Node slow = head;
	Node fast = head;
	
	for(int i=0;i<k;i++) {
		
		fast = fast.next;
	}
	
	
	while(fast!=null) {
		
		fast = fast.next;
		slow = slow.next;
			
	}
	
	return slow;
}
	public static void main(String[] args) {
		
		Node head = input();
		
		Node ans = kth(head,2);
		
		System.out.println(ans.data);

	}

}
