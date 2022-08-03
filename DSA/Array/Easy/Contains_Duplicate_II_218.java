package Easy;
import java.util.*;
/*
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in
 *  the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */
public class Contains_Duplicate_II_218 {

	public static boolean duplicate(int nums[] , int k) {
		
		// using HashMap
		
		HashMap<Integer ,Integer> map = new HashMap<>();
		
		
		for(int i=0;i<nums.length;i++) {
			
			
			if(map.containsKey(nums[i])) {
				
				
				if(i - map.get(nums[i])<=k) {
					
					return true;
				}
			}
			
			map.put(nums[i], i);
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		
          int nums[] = {1,2,3,1};
          
          int k =3;
          
          boolean ans = duplicate(nums,k);
          
          System.out.println(ans);
	}

}
