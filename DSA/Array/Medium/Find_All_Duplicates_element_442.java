package Medium;
import java.util.*;
public class Find_All_Duplicates_element_442 {

	// array me elements 1 se leke n tak honge
	
	/*
	 * algorithm
	 * 
	 * 1) array me element 1 se n tak hai to iska matlab ham mark laga skte hai kuch krke
	 * 2) array ke ith element -1 ke element ki jagah - element rkh do or check krlo agar vaha pe phle se negative hai to duplicacy hai
	 *  3) jaaha pe duplicate element mila hai to current index jo nikala hai +1 ans hoga
	 */
	public static List<Integer> duplicates(int nums[]){
		
		List<Integer> list = new ArrayList<>();
	
		int n = nums.length;
		for(int i=0;i<n;i++) {
			
			// abs value islye li hai kuki ham sbko -ve rkh rhe hai to
			int index = Math.abs(nums[i])-1;
			
			
			int val = nums[index];
			
			if(val<0) {
				// it means duplicacy occurs
				
				list.add(index +1);
			}
			else {
				
				nums[index]*=-1;
			}
			
		}
		
		
		
		return list;
	}
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,2};
		
		List<Integer> ans =duplicates(nums);
		
		for(int n:ans) {
			System.out.print(n+" ");
		}

	}

}
