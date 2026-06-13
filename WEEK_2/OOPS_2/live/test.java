package WEEK_2.OOPS_2.live;

import WEEK_2.OOPS_2.music.playable;
import WEEK_2.OOPS_2.music.string.veena;
import WEEK_2.OOPS_2.music.wind.saxophone;

public class test {
    public static void main(String[] args){
        veena v1=new veena();
        v1.play();

        saxophone s1=new saxophone();
        s1.play();

        playable p;
        p=new veena();
        p.play();

        p=new saxophone();
        p.play();
        
    }   
}