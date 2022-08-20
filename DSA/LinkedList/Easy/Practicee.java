package Easy;

import java.util.*;
public class Practicee {


	public static int unique(String words[] , String str[]) {
		
		
		HashMap<Character ,String> map = new HashMap<>();
		
		char ch = 'a';
		for(int i=0;i<str.length;i++) {
			
			map.put(ch, str[i]);
			ch++;
		}
		
		
    	Set<String> set = new HashSet<>();
	
	    for(int i=0;i<words.length;i++) {
		
		String s = words[i];
		
		String res = "";
		for(int j=0;j<s.length();j++) {
			
			res+= map.get(s.charAt(j));
		}
		
		set.add(res);
	}
		
		return set.size();
	}
	

	public static void main(String[] args) {
		
        String arr[] = {"a"};
        
        String str[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
        		"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        int ans= unique(arr ,str);
		
        System.out.println(ans);

	}

}
