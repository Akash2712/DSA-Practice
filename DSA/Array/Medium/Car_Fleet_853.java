package Medium;

import java.util.Arrays;

public class Car_Fleet_853 {

	public static int fleet(int target , int position[] , int speed[]) {
	
		int count =1;
		
		int n = position.length;
		
	
		 // 2d array cardata usme position and time hoga har ek car ka
		
		double [][]cardata = new double[n][2];
		
		for(int i=0;i<n;i++) {
			
			cardata[i][0] = position[i];
			cardata[i][1] = ((target-position[i])*1d)/speed[i];
		}
		
		// sort the cardata
		
		Arrays.sort(cardata,(a,b)->(Double.compare(a[0],b[0])));
		
	    //time taken 
		double tt = cardata[n-1][1];
		for(int i=n-2;i>=0;i--) {
			
			if(cardata[i][1]>tt) {
				
				count++;
				
				tt = cardata[i][1];
			}
		}
		
			
			
		return count;
	}
	public static void main(String[] args) {
		
		int position[] = {10,8,0,5,3};
		int speed[] = {2,4,1,1,3};
		int target =12;
		
	int ans =	fleet(target,position,speed);

	System.out.println(ans);
	}

}
