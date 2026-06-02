1class Solution {
2    public int maxSubArray(int[] nums) {
3       int sum=0;
4       int maxsum=Integer.MIN_VALUE;
5       for(int num:nums){
6        sum+=num;
7        if(sum>maxsum){
8            maxsum=sum;
9        }
10        if(sum<0){
11            sum=0;
12        }
13       }
14       return maxsum;
15    }
16}