package Easy;

public class Best_TIme_To_Buy_Sell_Stock_I_121 {

	public static int maxProfit(int prices[]) {
		
		// greedy approach max profit sbse phle stock khareedna hai fir bechna hai
		int profit =0;
		
		
		// if first day buy
		int buy = prices[0];
		
		int n = prices.length;
		
		
		for(int i=1;i<n;i++) {
			
			// if another day where stock price is low
			
			if(buy>prices[i]) {
				
				buy = prices[i];
			}
			
			
			int sell = prices[i] -buy;
			
			if(sell >profit) {
				profit = sell;
				
			}
			
		}
		
	
		return profit;

	}
	public static void main(String[] args) {
		
		int prices[] = {3,5,0,0,3,1,4};
		
		int ans = maxProfit(prices);
		
		System.out.println(ans);

	}

}
