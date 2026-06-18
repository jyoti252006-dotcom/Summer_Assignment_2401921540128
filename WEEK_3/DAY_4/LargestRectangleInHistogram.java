package WEEK_3.DAY_4;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
       Stack<Integer> st=new Stack<>();
       int maxarea=0;
       int n= heights.length;
       for(int i=0;i<=n;i++){
        int currlen=(i==n)?0:heights[i];
        while(!st.isEmpty() && currlen<heights[st.peek()]){
            int len=heights[st.pop()];
            int width;
            if(st.isEmpty()){
                width=i;
            }
            else {
                width=i-st.peek()-1;
            }
            maxarea=Math.max(maxarea,len*width);
        }
        st.push(i);
       }
       return maxarea;
    }
}