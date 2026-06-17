package WEEK_3.DAY_3;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minstak;

    public MinStack() {
        st=new Stack<>();
        minstak=new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(minstak.isEmpty()|| value<=minstak.peek()){
            minstak.push(value);
        }   
    }
    
    public void pop() {
        if (st.peek().equals(minstak.peek())){
            minstak.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minstak.peek();
    }
}