package Medium;

public class Range_Addition {
// you are given a integer n  length of the array and a 2d array queries {1,2,3} this from index 1  to 2 add 3 in arr[i] 
	 // return final array of length n after solve all the queries
	
	public static int [] queries(int length , int queries[][]) {
		int res [] = new int [length]; 
		
		// Appraoch if we go throug querie one by one then TC(nq) 
		// so we use prefix sum method 
		
		for(int i=0;i<queries.length;i++) {
			
			int start = queries[i][0];
			int end = queries[i][1];
			int operation = queries[i][2];
			
			res[start] += operation;
			
			if(end +1 <length) {
				
				res[end+1] -=operation;
			}
		}
		
		// prefix sum
		
		int sum =0;
		for(int i=0;i<res.length;i++) {
			
			sum+=res[i];
			
			res[i] = sum;
		
			
		}
		
		
		return res;
	}
	public static void main(String[] args) {
		int length =5;
		
		int [][]queries = {{1,3,2} ,{2,4,3}, {0,2,-2}};
		
		int ans [] = queries(length , queries);
		
		for(int n : ans) {
			System.out.print(n+" ");
		}

	}

}
