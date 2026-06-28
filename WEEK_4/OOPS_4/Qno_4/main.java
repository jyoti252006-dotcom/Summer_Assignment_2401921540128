package WEEK_4.OOPS_4.Qno_4;
class Box {

    protected int length;
    protected int breadth;

    // Constructor
    Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Area of rectangle
    public int area() {
        return length * breadth;
    }
}
class Box3D extends Box {

    private int height;

    // Constructor
    Box3D(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    // Volume
    public int volume() {
        return length * breadth * height;
    }
}

public class main {
    public static void main(String[] args) {

        Box3D box = new Box3D(5, 4, 3);

        System.out.println("Area = " + box.area());
        System.out.println("Volume = " + box.volume());
    }
}
