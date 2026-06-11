package WEEK_2.DAY_4;

import java.util.Stack;

public class decodeString {
    public String decodeString(String s){
        Stack<Integer> count=new Stack<>();
        Stack<StringBuilder> stringcount=new Stack<>();
        StringBuilder build=new StringBuilder();
        int k=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
            }
            else if(ch=='['){
                count.push(k);
                stringcount.push(build);
                k=0;
                build=new StringBuilder();
            }
            else if(ch==']'){
                int prev=count.pop();
                StringBuilder sb=stringcount.pop();
                for(int i=0;i<prev;i++){
                    sb.append(build);
                }
                build=sb;
            }
            else{
                build.append(ch);
            }
        }
        return build.toString();
    }
}