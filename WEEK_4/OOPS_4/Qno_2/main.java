package WEEK_4.OOPS_4.Qno_2;
class outer{
     void display() {
        System.out.println("This is Outer class display() method.");
    }

    class Inner {

        void display() {
            System.out.println("This is Inner class display() method.");
        }
    }
}

public class main {
    public static void main(String[] args) {
        outer obj=new outer();
        outer.Inner innerObj=obj.new Inner();
        innerObj.display();
    }   
}