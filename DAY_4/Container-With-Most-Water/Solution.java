1class Solution {
2    public int maxArea(int[] height) {
3        int left=0;
4        int right=height.length-1;
5        int maxarea=0;
6        while(left<right){
7            int h=Math.min(height[left],height[right]);
8            int w=right-left;
9            int a=h*w;
10            maxarea= Math.max(maxarea,a);
11            if(height[left]<height[right]){
12                left++;
13            }
14            else{
15                right--;
16            }
17        }
18        return maxarea;
19    }
20}