1class Solution {
2    public int maxProfit(int[] prices) {
3        int minprofit =Integer.MAX_VALUE;
4        int maxprofit=0;
5        for(int i=0;i<prices.length;i++){
6            if(prices[i]<minprofit){
7                minprofit=prices[i];
8            }
9            else if(prices[i]-minprofit>maxprofit){
10                maxprofit=prices[i]-minprofit;
11            }
12        }
13    return maxprofit;
14    }
15}