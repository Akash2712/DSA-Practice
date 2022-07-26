package Medium;

public class Product_of_array_Except_self_238 {

	/*
	 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
	 *  elements of nums except nums[i].
	 */
	
	
	/*
	 * // approach 1 

          product array nikalne ke liye pattern observe karo arr = {1,2,3,4} iska ans hoga {24,12,8,6};

        ek prefix mul array banao {1,2,6,24} 
         ek suffix mul array {24,24,12,4}

     ab current element ke -1 ka prefix elem * current element ke +1 ka suffix elemnt hi ans hoga

       last me +1 suffix krne ki wajah se ek kam chalao loop or fr 
         last me pre ka last element daaldo

	 */
	
	public static int [] product(int nums[]) {
		
		int right[] = new int [nums.length];
		
		
		int suf =1;
		for(int i=nums.length-1;i>=0;i--) {
			
			suf *= nums[i];
			
			right[i] = suf;
			
		}
		
		int n = nums.length;
		int res[] = new int[n];
		
		
		int pre =1;
		for(int i =0;i<n-1;i++) {
			
			int lp = pre;
			int rp = right[i+1];
			
			res[i] = lp *rp;
			
			pre *=nums[i];
		}
		
		
		res[n-1] = pre;
		
		
		
		return res;
		
	}
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
		
		int ans[] = product(nums);
		
		for(int n : ans) {
			
			System.out.print(n+" ");
		}

	}

}
