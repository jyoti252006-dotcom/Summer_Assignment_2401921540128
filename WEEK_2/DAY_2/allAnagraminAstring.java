package WEEK_2.DAY_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class allAnagraminAstring {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l1=new ArrayList<>();
        if(p.length()>s.length()){
            return l1;
        }
        int[] map1=new int[26];
        int[] map2=new int[26];
        
        for(int i=0;i<p.length();i++){
            map1[p.charAt(i)-'a']++;
            map2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(map1,map2)){
             l1.add(0);     
        }

        for(int i=p.length();i<s.length();i++){
            map2[s.charAt(i)-'a']++;
            map2[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(map1,map2)){
                l1.add(i-p.length()+1);
            }     
        }
        return l1;

    }
}
