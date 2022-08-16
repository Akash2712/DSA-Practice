package Medium;
import java.util.*;
/*
 * Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and
 *  is greater in value than n. 
 * If no such positive integer exists, return -1.
 */
public class Next_Greater_Element_III_556 {

/*
 * step 1  - given number ko string me change krke char array me store krlo  fr next permutation jese solve krdo 
 * 
	 *step 1 - arraye ke 2nd last element se search kro esa hai element jiska right element usse bada ho , 2 mila hai
	 *
	 *step2 - ab jo element mila hai(2) hai usse just greater element nikalo array ke last se travese keke (3)
	 *
	 *step3 - ab jo do element mile hai unhe swap krdo (2)swap(3) ==> 1,3,7,5,2
	 *
	 *step 4 - ab jo phle element mila tha uske index+1 se last tak pura array reverse krdo 1,3,2,5,7 
	 *
	 *ans mil jyga yahi -->1,3,2,5,7	
 */

	public static void swap(char arr[] , int i , int j) {
		
		char temp = arr[i];
		
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverse(char arr[],int i , int j ) {
		
		while(i<j) {
			
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}

	
	public static int  greater(int n) {
		
		
		String s = n+"";
		
		char arr[] = s.toCharArray();
		
		int   m = arr.length;
		
		int i = m-2;
		
		while(i>=0 && arr[i]>=arr[i+1]) {
			i--;
		}
		
		if(i>=0) {
			
			int j = m-1;
			
			while(arr[i]>=arr[j]) {
				j--;
			}
			
			swap(arr,i,j);
			
			String ans = "";
			
			reverse(arr,i+1 ,m-1);
			for(int k=m-1;k>=0;k--) {
				
				ans= arr[k]+ans;
			}
			
		    long val = Long.parseLong(ans);
		    
		    return val<=Integer.MAX_VALUE ?(int)val :-1;
		}
		
		
		return -1;
				
		
	}
	
	public static void main(String[] args) {
		

		
		int n =12;
		
		System.out.println(greater(n));
	
	
	
	}

}
