package Easy;

public class Reverse_Vowel_345 {

	public static boolean isvowel(char c) {
		
		if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'||c=='A' || c=='E'||c=='I'||c=='O'||c=='U') {
			
			return true;
		}
		
		return false;
	}
	
	public static String reverse(String str) {
		
		char arr[] = str.toCharArray();
		
		int i=0;
		int j = arr.length-1;
		
		while(i<j) {
			
			while( i<j && isvowel(arr[i])==false) {
				i++;
			}
		      
			while(i<j && isvowel(arr[j])==false) {
				j--;
			}
			
			//Swap
			
			char c = arr[i];
			arr[i] = arr[j];
			arr[j] =c;
			
			i++;
			j--;
		}
		
		return new String (arr);
	}
	public static void main(String[] args) {
		
		
		String str = "hello";
		
		String ans = reverse(str);
		
		System.out.println(ans);

	}

}
