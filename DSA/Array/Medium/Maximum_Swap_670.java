package Medium;

public class Maximum_Swap_670 {
// given number me maximum ek swap krna hai jisse number max possible ban jaye
	
	
	public static int maximum(int num) {
		
		// num to char array
		
		char arr[] = String.valueOf(num).toCharArray();
		
		// ek right max index ka array banao eg num =2736 -->  1,1,3,3 right max index array
		
		int n =arr.length;
		int rightmaxindex[] = new int [n];
		
		int index = n-1;
		
		char max = arr[index];
		rightmaxindex[n-1] = index;
		
		
		for(int i=n-2;i>=0;i--) {
			
			if(arr[i]>max) {
				max = arr[i];
				index =i;
			}
			
			rightmaxindex[i] = index;
		}
		
		
		// ab jaha pe tumhara arr[i]  match nahi kregfa arr[rightmax[i]] se vahi se swap krna hai
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]!=arr[rightmaxindex[i]]) {
				//Swap
				
				char temp = arr[i];
				
				arr[i] = arr[rightmaxindex[i]];
				
				arr[rightmaxindex[i]] = temp;
				
				
				return Integer.parseInt(String.valueOf(arr));
			}
		}
		
		return num;
		
	}
	public static void main(String[] args) {
		
		int num = 2736;
		
		int ans = maximum(num);
		
		System.out.println(ans);

	}

}
