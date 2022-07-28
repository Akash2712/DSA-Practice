package Easy;

import java.util.*;
public class Valid_Anagram_242 {


	public static boolean anagram(String s , String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		
		for(int i=0;i<s.length();i++) {
			
			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
		}
		
		for(char c : map.keySet()) {
			
			if(map.get(c)!=0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String s = "anagram";
		String t ="nagaram";
		
		
	boolean ans =	anagram(s,t);

	System.out.println(ans);
	}

}
