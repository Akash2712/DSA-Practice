package Hard;

import java.util.*;
public class Best_Meeting_point_296 {

	
	public static int meetingPoint(int nums[][]) {
		
		// 1. Get x-coordinate -> traverse row wise
		
		ArrayList<Integer> xcoordinate = new ArrayList<>();
		
		  for(int i=0;i<nums.length;i++) {
			  
			  for(int j =0;j<nums[0].length;j++) {
				  
				  if(nums[i][j]==1) {
					  xcoordinate.add(i);
				  }
			  }
		  }
		
		// 2 . Get y-coordinates -> traverse col wise
		  
		  ArrayList<Integer> ycoordinate = new ArrayList<>();
		  
		  for(int i=0;i<nums[0].length;i++) {
			  
			  for(int j=0;j<nums.length;j++) {
				  
				  if(nums[j][i]==1) {
					  ycoordinate.add(i);
				  }
			  }
			  
		  }
		 
		
		// 3. Get mid -> best meeting point
		  
		  int xmid = xcoordinate.get(xcoordinate.size()/2);
		  
		  int ymid = ycoordinate.get(ycoordinate.size()/2);
		  
		  System.out.println("Best meeting point is "+ "("+xmid+","+ymid+")");
		
		// 4. calculate distance -> min Distance(because of median
		
		  int dist =0;
		  
		  for(int n: xcoordinate) {
			  dist+= Math.abs(xmid-n);
		  }
		  
		  
		  for(int n : ycoordinate) {
			  
			  dist += Math.abs(ymid -n);
		  }
		  
		
		// 5. return ans
		return dist;
	}
	public static void main(String[] args) {
	
		
		int nums[][] = {{1,1,0} ,{0,0,0}, {0,1,1}};
		
		
		int ans = meetingPoint(nums);
		
		System.out.println(ans);
	
		 
		
	

	}

}
