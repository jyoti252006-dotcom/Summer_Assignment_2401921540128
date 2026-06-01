1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k=1;
4        //int expectednums[]=new int[nums.length];
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]!=nums[i-1]){
7                nums[k++]=nums[i];
8            }
9        }
10     return k; 
11    }
12}  