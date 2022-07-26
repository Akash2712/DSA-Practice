package Medium;

import java.util.Arrays;

public class Next_Permutation_31 {

	// next greater permutation dena hai cyclic array hai last wale 3,2,1 ke liye 1,2,3 hoga
	
	/**
	 *Algorithm
	 *
	 *arr = 1,2,7,5,3
	 *
	 *step 1 - arraye ke 2nd last element se search kro esa hai element jiska right element usse bada ho , 2 mila hai
	 *
	 *step2 - ab jo element mila hai(2) hai usse just greater element nikalo array ke last se travese keke (3)
	 *
	 *step3 - ab jo do element mile hai unhe swap krdo (2)swap(3) ==> 1,3,7,5,2
	 *
	 *step 4 - ab jo phle element mila tha uske index+1 se last tak pura array reverse krdo 1,3,2,5,7 
	 *
	 *ans mil jyga yahi -->1,3,2,5,7
	 *
	 * 
	 *
	 */
	
	public static void reverse(int nums[] , int i , int j) {
		
		
		while(i<j) {
			
			int temp = nums[i];
			nums[i] = nums[j];
			
			nums[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void swap(int nums[] , int a , int b) {
		
		int temp =nums[a];
		nums[a]=nums[b];
		nums[b] = temp;
	}
	
	
	public static void nextPermutation(int nums[]) {
		
		int n = nums.length;
		int i = n-2;
	
		while(i>=0 && nums[i]>=nums[i+1]) {
			
			i--;
		}
		
		if(i>=0) {
			
			int j = n-1;
			
			while(nums[j] <= nums[i]) {
				j--;
			}
			
			swap(nums ,i,j);
		}
		
		reverse(nums ,i+1,n-1);
	}
	public static void main(String[] args) {
	
		 int arr[] = {1,2,3};
		 
		 nextPermutation(arr);
		 
		 for(int n:arr) {
			 
			 System.out.print(n+" ");
		 }

		
	}

}
