1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] res=new int[26];
4        int left=0;
5        int maxfreq=0;
6        int maxlen=0;
7        for(int i=0;i<s.length();i++){
8            res[s.charAt(i)-'A']++;
9            maxfreq=Math.max(maxfreq,res[s.charAt(i)-'A']);
10            while((i-left+1)-maxfreq>k){
11                res[s.charAt(left)-'A']--;
12                left++;
13            }
14            maxlen=Math.max(maxfreq,i-left+1);
15        }
16        return maxlen;
17    }
18}