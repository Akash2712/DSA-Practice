package Medium;
import java.util.*;
public class Partition_Labels_763 {
// similar approach to max chunks in an arrayI
	
	public static List<Integer> partition(String s){
		
		List<Integer>ans = new ArrayList<>();
		
		// storing character's last index 
		HashMap<Character ,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			map.put(ch, i);
		}
		
		int prev =-1;
		int max =0;
		
		for(int i =0;i<s.length();i++) {
			
			char key = s.charAt(i);
			
			int n = map.get(key);
			
			max = Math.max(max, n);
			
			if(max==i) {
				
				int res = max - prev;
				ans.add(res);
				
				prev = max;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		
		String s ="ababcbacadefegdehijhklij";
		String p = "eccbbbbdec";
		List<Integer> res = partition(s);
		
		for(int n:res) {
			System.out.print(n+", ");
		}

	}

}
