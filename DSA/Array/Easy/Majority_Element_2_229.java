package Easy;
import java.util.*;
/*
 * Given an integer array of size n, find all elements that appear more than  n/3 times.
 * */

// ek array me max 2 element hi hoskte hai jo >n/3 times present ho

public class Majority_Element_2_229 {


	public static boolean isMajority(int nums[],  int val) {
		
		int count =0;
		
		for(int n : nums) {
			
			if(val==n){
				count++;
			}
		}
		return count > nums.length/3;
	}
	public static ArrayList<Integer> majorityElements(int nums[]){
		
		// check kro valid candidates 3 distinct element ke pair bnao
		
		int val1 = nums[0];
		int count1 =1;
		
		int val2 = nums[0] ;// val2 ko array ka koi bhi element assume kr skte ho lekin iska count 0 hi rkhna  hai
		int count2 =0;
		
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i =1;i<nums.length;i++) {
			
			if(val1==nums[i]) {
				
				count1++;
			}
			
			else if(val2==nums[i]) {
				count2++;
			}
			
			else {
				
				if(count1==0) {
					val1=  nums[i];
					count1=1;
				}
				
				else if(count2 ==0) {
					val2 = nums[i];
					count2=1;
				}
				
				else {
					// here we find a tripelet pair
					
					count1--;
					count2--;
					
				}
				
			}
		}
			
			// valid candidtae val1 and val2 check them is majority element or not
			
			
			
			if(isMajority(nums ,val1)) {
				
				ans.add(val1);
			}
			
			// check both element are not same
			
			if(val1 !=val2 && isMajority(nums ,val2)) {
				ans.add(val2);
			}
			
		
		
           return ans;	
	}
	
	public static void main(String[] args) {
		// same as majority element majority element me hmne 2 ke pair bnaye the isme kosis kro ki 3 ke pair bnao
		
		int nums[] = {3,2,3};
		
		ArrayList<Integer> ans= majorityElements(nums);
		
		for(int n : ans) {
			System.out.print(n+" ");
		}

	}

}
