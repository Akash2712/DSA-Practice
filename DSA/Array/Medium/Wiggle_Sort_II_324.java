package Medium;

import java.util.Arrays;
/*
 * Given an integer array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
 */
public class Wiggle_Sort_II_324 {

	
	public static void sort(int nums[]) {
		
		Arrays.sort(nums);
		
		int n =nums.length;
		int res[] = new int[nums.length];
		
		int k=n-1;
		for(int i=1;i<n;i+=2) {
			
			res[i] = nums[k];
			k--;
		}
		
		for(int i=0;i<n;i+=2) {
			
			res[i] = nums[k];
			k--;
		}
		
		for(int i=0;i<n;i++) {
			
			nums[i] = res[i];
		}
	}
	public static void main(String[] args) {
		
		int nums[] = {4,5,5,6};
		
		sort(nums);
		
		for(int n:nums) {
			
			System.out.print(n+" ");
		}
	
	}
}
