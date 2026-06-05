package WEEK_1.DAY_1;
class Solution {
    public int remove_duplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k++]=nums[i];
            }
        }         
        return k; 
    }
}