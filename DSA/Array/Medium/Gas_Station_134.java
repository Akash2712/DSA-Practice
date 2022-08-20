package Medium;

public class Gas_Station_134 {

	public static int canCompleteCycle(int gas[]  , int cost[]) {
	
		int total_gas = 0;
		int total_cost =0;
		
		for(int i=0;i<gas.length;i++) {
			
			total_gas += gas[i];
			
			total_cost += cost[i];
		}
		
		if(total_gas < total_cost) {
			
			return -1;
		}
		
		int remaining_fuel =0;
		
		int index =0;
		for(int i=0;i<gas.length;i++) {
			
			remaining_fuel = gas[i]-cost[i];
			
			if(remaining_fuel<0) {
				
				remaining_fuel =0;
				index = i+1;
			}
			
		}
		
		return index;
	}
	public static void main(String[] args) {
		
		int gas[] = {5,1,2,3,4};
		
		int cost[] = {4,4,1,5,1};
		
		int ans = canCompleteCycle(gas,cost);
		
		System.out.println(ans);

	}

}
