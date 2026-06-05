package WEEK_1.DAY_2;

class Solution {
    public int max_SubArray(int[] nums) {
       int sum=0;
       int maxsum=Integer.MIN_VALUE;
       for(int num:nums){
        sum+=num;
        if(sum>maxsum){
            maxsum=sum;
        }
        if(sum<0){
            sum=0;
        }
       }
       return maxsum;
    }
}