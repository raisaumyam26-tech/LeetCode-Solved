class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int min=prices[0], diff=0,f=0;
        for(int i=0; i<l; i++){
            if(prices[i]<min) min=prices[i];
            diff=prices[i]-min;
            if(diff>f) {f=diff;}

        }
        
        return f;
    }
}