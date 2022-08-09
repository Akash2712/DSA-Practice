package Medium;

public class Rotate_Image_48 {

	public static void rotate(int nums[][]) {
		
		int n = nums.length;
		
		// Transpose matrix
		for(int i=0;i<n;i++) {
			
			for(int j =i;j<n;j++) {
				
				int temp = nums[i][j];
				
				nums[i][j] = nums[j][i];
				nums[j][i] = temp;
			}
		}
		
		// reverse each row of matrix
		
		for(int i=0;i<n;i++) {
			
			int left =0;
			int right = n-1;
			
			while(left<right) {
				
				int temp = nums[i][left];
				
				nums[i][left] = nums[i][right];
				nums[i][right] = temp;
				
				left++;
				right--;
			}
		
		}
	}
	
	public static void print(int nums[][]) {
		
		int n = nums.length;
		
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				System.out.print(nums[i][j]+" ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
    
		
		int  nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		print(nums);
		
		rotate(nums);
		
		print(nums);

	}

}
