package WEEK_1.DAY_3;

public class move_zeroes {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                if(i!=j){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                j++;
            }
        }
    }
}