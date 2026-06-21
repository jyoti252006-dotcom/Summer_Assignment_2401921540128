package WEEK_3.OOPS_3;

abstract class compartment {
    public abstract String notice();  
}
class FirstClass extends compartment{
    public String notice(){
        return "first compartment only";
    }
}
class ladies extends compartment{
    public String notice(){
        return "ladies compartment only";
    }
}
class general extends compartment{
    public String notice(){
        return "general compartment only";
    }
}
class luggage extends compartment{
    public String notice(){
        return "luggage compartment";
    }
}

public class testCompartment{
    public static void main(String[] args){
        compartment[] compartments=new compartment[10];

        for(int i=0;i<compartments.length;i++){
            int random=(int)(Math.random()*4)+1;

            switch(random){
                case 1:
                    compartments[i]=new FirstClass();
                    break;
                case 2:
                    compartments[i]=new ladies();
                    break;
                case 3:
                    compartments[i]=new general();
                    break;
                case 4:
                    compartments[i]=new luggage();
                    break;
            } 
        }
        System.out.println("compartment notices");
        for(compartment c:compartments){
            System.out.println(c.notice());
        }
    }
}