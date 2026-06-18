package WEEK_3.DAY_4;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if("+-*/".contains(token) && token.length()==1){
                int b=stack.pop();
                int a=stack.pop();
                switch(token){
                    case "+"-> stack.push(a+b);
                    case "-"-> stack.push(a-b);
                    case "*"-> stack.push(a*b);
                    case "/"-> stack.push(a/b);
                }
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}