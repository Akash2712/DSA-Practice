package Easy;
import java.util.*;
public class Next_Greater_I_496 {

	// ek query array diya hai or ek nums array query solve krte hue batana hai nums me query[i] ka next greater element konsa hoga
	
	public static int [] greater(int query[] , int nums[]) {
		
		// isko solve krne ke liye phle pata hona chahiye next greater element kese nikalte hai
		// NGE nikalke use hashmap me store krlo  key value pair me
		
		// next greater element nikalne ke liye stack bnao ek
		
		HashMap<Integer ,Integer> map = new HashMap<>();
		Stack<Integer> st = new Stack<>();
		
		// hame pata hai ki array ke last element ko koi next greater nahi hota
		
		map.put(nums[nums.length-1], -1);
		
		st.push(nums[nums.length-1]);
		
		// ulti loop chlao
		
		for(int i = nums.length-2;i>=0;i--){
			
			// jabtk pop karo ya to stack empty na ho jaye ya jo peek element chota ho current se
			
			while(st.size() >0 && nums[i]>= st.peek()) {
				st.pop();
			}
			
			// agar stack empty hogya iska matlab current element ko koi greater element nahi hai
			
			if(st.size()==0) {
				
				map.put(nums[i], -1);
			}
			
			// agar empty nahi hai iska matlab stack ki peek pe usse bada element pda h to vhi uska greater element hoga
			else {
				
				map.put(nums[i], st.peek());
			}
			
			// current element ko  push krdo
			
			st.push(nums[i]);
		}
		
		
		// hamne map me store krliya ki har ek element ka next greater kon hai
		
		int res[] = new int [query.length];
		
		for(int i =0;i<res.length;i++) {
			
			res[i] = map.get(query[i]);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
	
		
		int query [] = {4,1,2};
		int nums[] = {1,3,4,2};
		
		int ans[] = greater(query,nums);
		
		for(int n:ans) {
			System.out.print(n+" ");
		}
	

	}

}
