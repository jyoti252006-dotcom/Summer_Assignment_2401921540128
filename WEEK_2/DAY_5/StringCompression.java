package WEEK_2.DAY_5;

public class StringCompression {
    public int compress(char[] chars){
        int write=0;
        int i=0;
        while(i<chars.length){
            char current=chars[i];
            int count=0; //times of repeatation
            int j=i; //similar ko track krne k lie
            while(j<chars.length && chars[j]==current){
                count++;
                j++;
            }
            chars[write++]=current; //character ko add krne k lie
            if(count>1){
                String cnt=String.valueOf(count); //count ko string bna dia
                for(char ch:cnt.toCharArray()){
                    chars[write++]=ch; //12='1','2' aese store krne k lie
                }
            }
            i=j; //similar wale avoid krne k lie
        }
        return write;
    }
}