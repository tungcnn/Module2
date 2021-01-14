import java.util.Random;

public class ResizableTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();

        double percent;
        System.out.println("Pre-resize");
        //Circle
        System.out.println("Radius: " + c.getRadius());
        percent = Math.random();
        c.resize(percent);
        //Rectangle
        System.out.println("Rectangle width: " + r.getWidth() + " and length = " + r.getLength());
        percent = Math.random();
        r.resize(percent);
        //Square
        System.out.println("Square width: " + s.getWidth() + " and length = " + s.getLength());
        percent = Math.random();
        s.resize(percent);

        System.out.println("After resize");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Rectangle width: " + r.getWidth() + " and length = " + r.getLength());
        System.out.println("Rectangle width: " + s.getWidth() + " and length = " + s.getLength());
    }
}
