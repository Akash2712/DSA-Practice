package Medium;
import java.util.*;
public class Next_Greater_Element_II_503 {
// next greater element nikalna hai on right lekin array circular jaa skta hai jese last wla 3 ka NGE ghum ke 4 ho skta hai
	
	public static int [] greater(int nums[]) {
		
		int n = nums.length;
		int res[] = new int [n];
		
		// similar as NGE_I isme circular hai to given array ko 2 bar likhnege to vo circular ki trah treat krne lgegea
		// eg-- {1,2,3,4,3} ==> {1,2,3,4,3,1,2,3,4,3}  lekin ye double size ka array bnanae ki jrurat nahi hai 
		// assume krlo repeated array ko i%n  kroge to wpas usi index pe phauch jaaoge
		
		// or same NGE_I jese krdo
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = (2*n)-1;i>=0;i--) {
			
			while(!st.isEmpty() && nums[i%n] >= st.peek()) {
				
				st.pop();
			}
			
			if(st.isEmpty()) {
				res[i%n] = -1;
			}
			
			else {
				
				res[i%n] = st.peek();
			}
			
			st.push(nums[i%n]);
		}
		
		
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,3};
		
		int ans [] = greater(nums);
		
		for(int n : ans) {
			System.out.print(n+" ");
		}

	}

}
