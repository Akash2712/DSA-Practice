package Easy;

public class Valid_Palindrome_II_680 {

	
	public static boolean valid(String str) {
		
		int i=0;
		int j = str.length()-1;
		
		int count =1;
		while(i<=j) {
			
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				continue;
			}
			
			else {
				i++;
				j--;
				count--;
			}
			
			
		
		}
		
	   if(count==0 || count==1) {
		   return true;
	   }
	   else {
		   return false;
	   }
	}
	public static void main(String[] args) {
		
		String s = "abca";
		
		boolean ans = valid(s);
		
		System.out.println(ans);

	}

}
