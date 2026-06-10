package WEEK_2.DAY_3;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s){
        String s1=s+s;
        return s1.substring(1,s1.length()-1).contains(s);
    }
}