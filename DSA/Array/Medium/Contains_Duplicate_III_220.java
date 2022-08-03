package Medium;

import java.util.*;

/*
 * Given an integer array nums and two integers k and t, return true if there are two distinct indices i and j 
 * in the array such that abs(nums[i] - nums[j]) <= t  and abs(i - j) <= k.
 */
public class Contains_Duplicate_III_220 {

	
	public static boolean duplicate(int nums[], int k , int t) {
	
	
		HashMap<Integer ,Integer> map = new HashMap<>();
		
		for(int i =0;i<nums.length;i++) {
			
			int key = Math.abs(t-nums[i]);
			
			if(map.containsKey(key)) {
				
				if((i - map.get(key)) <=k) {
					return true; 
				}
			}
			
			map.put(nums[i], i);
			
		}
	
	return false;
	}
	public static void main(String[] args) {
		
		int nums[] = {8,7,15,1,6,1,9,15};
		
		int k =1;
		int t =3;
		
		
		boolean ans = duplicate(nums ,k,t);
		
		System.out.println(ans);

	}

}
