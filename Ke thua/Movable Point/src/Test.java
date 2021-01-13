public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(6,7);
        System.out.println(point1.toString());

        MovablePoint point2 = new MovablePoint(5.7f, 6.9f);
        point2.setXY(9, 6);
        for (int i = 0; i < 10; i++) {
            MovablePoint point = point2.move();
            System.out.println(point.toString());
        }
    }
}
