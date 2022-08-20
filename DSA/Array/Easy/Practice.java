package Easy;
import java.util.*;
public class Practice {


	public static int p(int arr[] , String s) {
		
		int res = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(s.charAt(i)=='0') {
				
				res= Math.min(res, arr[i]);
			}
		}
		
		
		return res;
	}
	
	
public static void main(String[] args) {
   
	
  int arr[] = {10,100,100,10,10};
  String s = "00001";
  
  System.out.println(p(arr,s));

}

}
 