package WEEK_2.DAY_3;

public class indexOfFirstOccurence {
    public int strStr(String haystack, String needle){
        int m=haystack.length();
        int n=needle.length();
        for(int i=0;i<=m-n;i++){
            int j=0;
            while(j<n && haystack.charAt(i-j)==needle.charAt(j)){
                j++;
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
}
