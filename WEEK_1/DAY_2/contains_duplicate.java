package WEEK_1.DAY_2;

import java.util.HashSet;

public class contains_duplicate {
     public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            if(set.contains(ele)){
                return true;
            }
            set.add(ele);
        }
        return false;
    }
}