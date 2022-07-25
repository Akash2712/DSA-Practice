package Easy;

/*Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing orde*/
public class Squares_of_a_sorted_Array_977 {

	public static int [] square (int nums[]) {
		
		int res[] = new int [nums.length];
		
		for(int i=0;i<nums.length;i++) {
			
			nums[i] = nums[i] * nums[i];
		}
		
		
		int i =0;
		int j = nums.length-1;
	//	int k = res.length-1;
		
		for(int k = res.length-1;k>=0;k--) {
			
			if(nums[i] < nums[j]) {
				
				res[k] = nums[j];
				j--;
			}
			
			else {
				
				res[k] = nums[i];
				i++;
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		
		int arr[] = {-7,-3,2,3,11};
		
		int ans[] = square(arr);
		
		for(int n:ans) {
			System.out.print(n+" ");
		}
	}

}
