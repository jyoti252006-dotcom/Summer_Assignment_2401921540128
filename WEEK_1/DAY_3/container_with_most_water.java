package WEEK_1.DAY_3;

public class container_with_most_water {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            int a=h*w;
            maxarea= Math.max(maxarea,a);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}