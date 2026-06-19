package WEEK_3.DAY_5;

import java.util.Stack;

public class ImplementQueueusingStacks {
    Stack<Integer>instack;
    Stack<Integer>outstack;

    public ImplementQueueusingStacks() {
        instack=new Stack<>();
        outstack=new Stack<>();
    }
    
    public void push(int x) {
        instack.push(x);        
    }
    
    public int pop() {
        peek();
        return outstack.pop();        
    }
    
    public int peek() {
        if(outstack.isEmpty()){
            while(!instack.isEmpty()){
                outstack.push(instack.pop());
            }
        }
        return outstack.peek();    
    }
    
    public boolean empty() {
        return instack.isEmpty() && outstack.isEmpty();   
    }
}