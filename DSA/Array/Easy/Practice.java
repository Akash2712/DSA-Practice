package Easy;
import java.util.*;
public class Practice {


	public static int maxArea(int [][]arr) {
	
		int m = arr.length;
		int n = arr[0].length;
		
		int max =0;
		
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(arr[i][j]==1) {
					max = Math.max(max, count_Island(i,j,arr));
					
				}
			}
		}
		
		return max;
	}
	
	public static int count_Island( int i , int j,int arr[][]  ) {
		
		 if(i<0 || j<0 || i>=arr.length || j>= arr[0].length ||arr[i][j]<=0) {
			 return 0;
		 }
		 
		 
		 arr[i][j]=-1;
		 
		 
		 int a = count_Island(i-1,j,arr);
		 int b = count_Island(i+1,j,arr);
		 int c = count_Island(i,j+1,arr);
		 int d = count_Island(i,j-1,arr);
		 
		 
		 int r = a+b+c+d;
		 
		 return 1+r;
	}
	
public static void main(String[] args) {
		
   
    int arr[][] = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0}
                  ,{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0}
                  ,{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
  
    int ans = maxArea(arr);
    
    System.out.println(ans);
		
	}

}
 