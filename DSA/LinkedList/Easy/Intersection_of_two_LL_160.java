package Easy;

import java.util.*;
import java.util.Scanner;

public class Intersection_of_two_LL_160 {


	public static Node<Integer> input() {
		
	//	System.out.println("Enter head");
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
	
	public static Node<Integer> intersection(Node<Integer>headA ,Node<Integer>headB){
		
		if(headA==null || headB==null) {
			return null;
		}
		
		Node<Integer> a = headA;
		Node<Integer> b = headB;
		
		
		while(a.data!=b.data && a!=b) {
			
			
			if(a==null) {
				
				return b;
			}
			else if(b==null) {
				
				return a;
			}
			
			else {
				a = a.next;
				b = b.next;
			}
		}
	
		      
		      
		        
		      
		        
		return a;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter Ist list");
		Node<Integer> headA = input();
		
		System.out.println("Enter 2nd list");
		
		Node<Integer> headB = input();
		
		
		Node<Integer> ans = intersection(headA ,headB);
		
		if(ans==null) {
			
			System.out.println(ans);
		}
		else {
			System.out.println(ans.data);
		}
	
		
		
		
	
		
		
	}

}
