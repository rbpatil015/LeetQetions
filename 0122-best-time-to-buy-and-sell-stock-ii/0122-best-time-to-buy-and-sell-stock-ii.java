class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;  int sell=1; int maxProfit=0;
        
        while(sell<prices.length){
            boolean isProf=false;
                if(prices[buy] < prices[sell]){
                        maxProfit+=( prices[sell] - prices[buy]);            
                        isProf=true;
                }
                if(isProf || (prices[buy] > prices[sell])){
                     buy=sell;
                }
                
                sell++;                
                }
        
            return maxProfit;


    }
}