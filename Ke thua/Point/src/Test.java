import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        point1.setXY(7, 9);
        System.out.println(point1.toString());

        Point2D point2 = new Point2D(3, 4);
        System.out.println(point2.toString());

        Point3D point3 = new Point3D();
        System.out.println(point3.toString());

        Point3D point4 = new Point3D(7, 8, 9);
        point4.setXYZ(1.6f, 2.3f, 3.9f);
        System.out.println(point4.toString());
    }
}
