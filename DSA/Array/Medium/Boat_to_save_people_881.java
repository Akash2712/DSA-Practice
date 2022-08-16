package Medium;

import java.util.Arrays;

public class Boat_to_save_people_881 {

	// minimum kitni boat lgegei sbko bitahne me ek bar me jada se jada 2 baith skte hai or limit exeed nahi ho skti
	
	public static int minBoat(int people[] , int limit) {
	
		int boatCount =0;
	
		//step1 sort krdo array ko 1,2,4,5  limit =6  ab pair bana do or check krlo agar limit se less than equal to hai to 
		// pair ban skta hai nahi to max weight wala akele boat me jaayega
		
		Arrays.sort(people);
		int i=0;
		int j = people.length-1;
		
		
		while(i<=j) {
			
			if(people[i]+people[j]<=limit) {
				
				// pair ban gaya or limit exceed nahi ho rahi
				boatCount++;
				i++;
				j--;
			}
			else {
				// pair nahi banta to jada weight wale ko bitha do
				
				boatCount++;
				j--;
			}
		}
	  return boatCount;
	}
	public static void main(String[] args) {
		
		
		int people[] = {5,1,4,2};
		
		int limit =6;
		
		int ans = minBoat(people, limit);
		
		System.out.println(ans);

	}

}
