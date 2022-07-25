package Easy;

/*  Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed,
 *  and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, 
with some characters (possibly none) being long pressed.*/

public class Faulty_Keyboard_925 {

	// similar to isSubsequence pattern with some variations
	
	public static boolean isValid(String name , String typed) {
		
		// agar name hi bada hua typed se 
		if(name.length() > typed.length()) {
			return false;
		}
		
		int i =0;
		int j =0;
		
		int m = name.length();
		int n = typed.length();
		
		
		while (i < m && j<n) {
			
			if(name.charAt(i)==typed.charAt(j)) {
				
				i++;
				j++;
			}
			
			// check the long press
			else if(i > 0 && name.charAt(i-1)==typed.charAt(j)) {
				j++;
			}
			
			else {
				return false;
			}
		}
		
		// check remaining characters in j is long press charcter or anything else
		
		while(j<n) {
			
			if(name.charAt(i-1)!=typed.charAt(j)) {
				return false;
			}
			j++;
		}
		
		
		// check whole name is traverse or not
		
		return i<n ? false:true;
		
	}
	
	public static void main(String[] args) {
		
		String name = "";
		
		String typed = "";
		
		boolean ans = isValid(name , typed);
		
		System.out.println(ans);

	}

}
