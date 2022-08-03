package Hard;
import java.util.*;
public class Max_Chunks_II_768 {

	// max partition krne array ke jo har ek partion ko indvidually sort kroge to pura array sort hojyga
	public static int chunks(int arr[]) {
		
		int n = arr.length;
		// step 1  create right min array of size n+1
		
		int rightmin[] = new int [n+1];
		
		rightmin[n] = Integer.MAX_VALUE;
		
		for(int i=n-1;i>=0;i--) {
			
			rightmin[i] = Math.min(arr[i], rightmin[i+1]);
			
		}
		
		// now create leftmax array
		// instead of creating leftmax array we track the max element
		int leftmax =Integer.MIN_VALUE;
		
		int count =0;
		for(int i=0;i<n;i++) {
			
			leftmax = Math.max(leftmax, arr[i]);
			
			if(leftmax <= rightmin[i+1]) {
				count++;
			}
		}
		
	return count;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int arr[] = {2,1,4,3,5};
		
		
		int ans = chunks(arr);
		
		System.out.println(ans);

	}

}
