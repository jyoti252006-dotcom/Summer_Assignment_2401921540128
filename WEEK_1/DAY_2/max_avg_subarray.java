package WEEK_1.DAY_2;

public class max_avg_subarray {
    public double findMaxAverage(int[] nums, int k) {
        long winsum=0;
        for(int i=0;i<k;i++){
            winsum+=nums[i];
        }
        long maxsum=winsum;
        for(int i=k;i<nums.length;i++){
            winsum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,winsum);
        }
        return (double)maxsum/k;
    }
}
