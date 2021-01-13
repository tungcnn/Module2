public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(16);
        circle1.setColor("Black");
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(10, "red");
        System.out.println(circle2.getArea());
        System.out.println(circle2.toString());

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setRadius(43);
        cylinder1.setHeight(13);
        System.out.println(cylinder1.toString());

        Cylinder cylinder2 = new Cylinder(6, 8, "green");
        System.out.println(cylinder2.getVolume());
        System.out.println(cylinder2.toString());
    }
}
