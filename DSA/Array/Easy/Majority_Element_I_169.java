package Easy;
/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than n / 2 times. You may assume that the majority element always 
exists in the array.
 */

// brute fore two for loops O(n^2)
//brute using hashmap O(n) and SC O(n)

// follow up TC O(n) and SC O(1)


public class Majority_Element_I_169 {

	
	public static int validCandidate(int arr[]) {
		
		int val = arr[0];
		int count =1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(val==arr[i]) {
				count++;
			}
			
			else {
				count--;
			}
			
			if(count==0) {
				
				val = arr[i];
				count=1;
			}
		}
		
		return val;
	}
	public static int majority(int arr[]) {
		
		// Moores's Vooting Algorithm
		
		// check kro konsa candidate majority element ho skta hai distinct elements ko pair krdo or jo element bachega usko chcek kr
		// check krlo ki vo n/2 times se jada hai ya nahi
		
		int num = validCandidate(arr);
		
		// check this element is more than n/2 times
		
		int count =0;
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				count++;
			}
		}
		
		if(count > arr.length/2) {
			return num;
		}
		else {
			
		// there is no majority element
		return 0;
		}
	}
	public static void main(String[] args) {
	
		 int arr[] = {3,2,3};
		 System.out.println(majority(arr));

	}

}
