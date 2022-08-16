package Medium;

// leetcode 1007
public class Minimum_Domino {

	public static int domino(int top[] , int bottom[]) {
		
		// kisi bhi top ya bottom ko same bana skte hai uske domino se swap krke min kitni rotation me
		
		// pick top[0] and bottom [0] 4 possiblity hai 1) to top ko pura 2 bana do (2) top ko pura 5 bana do
		                                //  (3) bottom ko pura 5 bana do (4) bottom ko pura 2 bana do 
		
		// possibility 1
		int n = top.length;
		int count1 =0;
		
		int num1 = top[0];
		int num2 = bottom[0];
		for(int i=0;i<n;i++) {
			
			if(count1!=Integer.MAX_VALUE) {
			if(top[i]==num1) {
				continue;
			}
			
			else if(bottom[i]==num1) {
				count1++;
			}
			else {
				count1 =Integer.MAX_VALUE;
			}
			}
		}
		
		//  possibilty 2
		
		int count2 =0;
		
		for(int i=0;i<n;i++) {
			
			if(count2!=Integer.MAX_VALUE) {
			if(top[i]==num2) {
				continue;
			}
			
			else if(bottom[i]==num2) {
				count2++;
			}
			
			else {
				count2 = Integer.MAX_VALUE;
			}
			}
		}
		
		// possibility 3
		
		int count3=0;
		for(int i=0;i<n;i++) {
			
			if(count3!=Integer.MAX_VALUE) {
			if(bottom[i]==num2) {
				
				continue;
			}
			
			else if(top[i]==num2) {
				count3++;
			}
			
			else {
				count3 = Integer.MAX_VALUE;
			}
			}
		}
		
		// possibilty 4
		
		int count4=0;
		
		for(int i=0;i<n;i++) {
			
			if(count4!=Integer.MAX_VALUE) {
			if(bottom[i]==num1) {
				continue;
			}
			
			else if(top[i]==num1) {
				count4++;
			}
			
			else {
				count4 =Integer.MAX_VALUE;
			}}
			
		}
		
		
		int res = Math.min(count1 ,Math.min(count3, Math.min(count2, count4)));
		
		if(res==Integer.MAX_VALUE) {
			return -1;
		}
		else{
			return res;
		}
	}
	public static void main(String[] args) {
		
		int top[] = {3,5,1,2,3};
		int bottom[] = {3,6,3,3,4};
		
		
		int ans = domino(top,bottom);
		
		System.out.println(ans);

	}
}
