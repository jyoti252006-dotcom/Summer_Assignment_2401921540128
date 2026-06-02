1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        long winsum=0;
4        for(int i=0;i<k;i++){
5            winsum+=nums[i];
6        }
7        long maxsum=winsum;
8        for(int i=k;i<nums.length;i++){
9            winsum+=nums[i]-nums[i-k];
10            maxsum=Math.max(maxsum,winsum);
11        }
12        return (double)maxsum/k;
13    }
14}