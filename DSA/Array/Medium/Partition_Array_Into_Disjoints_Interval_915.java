package Medium;

import java.util.*;
public class Partition_Array_Into_Disjoints_Interval_915 {

	
	
	
public static int partition(int nums[]) {
 
	int n = nums.length;
	// step 1  create right min of n+1 size
	
	int rightmin[] = new int [n+1];
	
	rightmin[n] = Integer.MAX_VALUE;
	
	for(int i=n-1;i>=0;i--) {
		
		rightmin[i] = Math.min(nums[i], rightmin[i+1]);
	}
	
	// maintains left max and check where leftmax is less than righmin[i+1] thats the index  where partition occurs
	
	int leftmax = Integer.MIN_VALUE;
	
	int ans =0;
	
	for(int i=0;i<nums.length;i++) {
		
		leftmax = Math.max(leftmax, nums[i]);
		
		if(leftmax <= rightmin[i+1]) {
			
			ans =i;
			break;
		}
	}
	return ans+1;
	
}

	public static void main(String[] args) {
		 
		int arr[] = {1,1,2,2};
		
		
		int ans = partition(arr);
		
		System.out.println(ans);
	}

}
