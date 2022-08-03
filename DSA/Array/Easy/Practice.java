package Easy;
import java.util.*;
public class Practice {

	public static void transpose(int mat[][]) {
		
		int n = mat.length;
		int m = mat[0].length;
		
		
		for(int i=0;i<n;i++) {
			
			for(int j=i;j<m;j++) {
				
				if(i==j) {
					continue;
				}
				
				else {
					
					int temp = mat[i][j];
					
					mat[i][j] = mat[j][i];
					
					mat[j][i] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
       int mat[][] = {{11,12,13},{21,22,23},{31,32,33}};
       
       
       for(int i=0;i<mat.length;i++) {
    	   
    	   for(int j =0;j<mat[0].length;j++) {
    		   
    		   System.out.print(mat[i][j]+" ");
    	   }
    	   
    	   System.out.println();
       }
       
       transpose(mat);
       System.out.println();
       
  for(int i=0;i<mat.length;i++) {
    	   
    	   for(int j =0;j<mat[0].length;j++) {
    		   
    		   System.out.print(mat[i][j]+" ");
    	   }
    	   
    	   System.out.println();
       }
       
	}

}
