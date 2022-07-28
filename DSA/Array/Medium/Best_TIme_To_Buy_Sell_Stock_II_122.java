package Medium;

public class Best_TIme_To_Buy_Sell_Stock_II_122 {

	/*
	 * 
	 * max profit dena hai ek array me ham kitni bar bhi ek stock khareed skte hai or use bech skte hai 
	 * lagatr do nahi kharred sakte 
	 * prices[] = {7,1,5,3,6,4}
	 * 
	 * isme hame dikh raha hai ki jab bhi prices low se high hua hai tab ham khareed skte the or sbka sum hi max Profit hoga
	 */
	public static int maxProfit(int prices[]) {
		
		int profit = 0;
		
		for(int i=1;i<prices.length;i++) {
			
			if(prices[i]>prices[i-1]) {
				
				profit+= prices[i] - prices[i-1];
			}
		}
		
		return profit;
	}
	public static void main(String[] args) {
		
		int prices[] = {3,3,5,0,0,3,1,4};
		
		int ans = maxProfit(prices );

		System.out.println(ans);
	}

}
