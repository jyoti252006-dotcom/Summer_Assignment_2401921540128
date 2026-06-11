package WEEK_2.DAY_4;

public class ReverseAwordinString {
    public String reverseWords(String s){
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            char[] ans=words[i].toCharArray();
            int left=0;
            int right=ans.length-1;
            while(left<right){
                char temp=ans[left];
                ans[left]=ans[right];
                ans[right]=temp;
                left++;
                right--;
            }
            words[i]=new String(ans);
        }
        return String.join(" ",words);
    }
}