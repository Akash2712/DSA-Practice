package Easy;

import java.util.*;
/*
 * Given an integer array nums,
 *  return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class Contains_Duplicate_217 {

	
	public static boolean duplicate(int nums[]) {
		//brute force using two for loops and when nums[i] and nums[j] are equal return true TC O(n^2)
		
		// optimal using set if set already contains element it means duplicate are found TC O(n) and SC O(N)
		
		Set<Integer> set  = new HashSet<>();
		
		for(int n :nums) {
			
			if(set.contains(n)) {
				return true;
			}
			
			set.add(n);
		}
		
		
		return false;
	}
	public static void main(String[] args) {
		
		
		int nums[] = {1,2,3,42,234};
		
		
		boolean ans = duplicate(nums);
		
		System.out.println(ans);
	}

}
