package WEEK_4.OOPS_4.Qno_3;
class Point{
    private int x;
    private int y;

        // Default Constructor
    Point() {
        x=0;
        y=0;
    }

        // Parameterized Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

        // Setter for x
    public void setX(int x) {
        this.x = x;
    }

        // Setter for y
    public void setY(int y) {
        this.y = y;
    }

        // Setter for both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

        // Display method
    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class main {
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(10, 20);
        p2.display();

        p2.setX(50);
        p2.setY(60);
        p2.display();

        p2.setXY(100, 200);
        p2.display();
    }
}
