package Medium;

// 2d matrix diya hai 0 and 1 ka max area nikalna hai 1 ka

public class Max_Area_Island_653 {

	
	public static int maxArea(int grid[][]) {
		
		int m = grid.length;
		int n = grid[0].length;
		
		int max =0;
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(grid[i][j]==1) {
					
					max = Math.max(max, recursion(i,j,grid));
				}
			}
		}
		
		return max;
	}
	
	public static int recursion(int i , int j , int grid[][]) {
		
		if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j]<=0) {
			return 0;
		}
		
		
		//mark lagao taki dubara same index calculate na ho
		
		grid[i][j] =-1;
		
		int leftarea = recursion(i,j-1,grid);
		int rightarea = recursion(i,j+1,grid);
		
		int upperarea = recursion(i-1,j,grid);
		int lowerarea = recursion(i+1 ,j ,grid);
		
		int totalarea = leftarea + rightarea + upperarea+ lowerarea;
		
		return 1 + totalarea;
	}
	public static void main(String[] args) {
		
		int grid[][] = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0}
        ,{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0}
        ,{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		
		int ans = maxArea(grid);
		
		System.out.println(ans);

	}

}
