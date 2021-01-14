public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        shapes[3] = new Square();
        shapes[4] = new Square();

        for (Shape shape:shapes) {
            if (shape instanceof Square) {
                Square sq = (Square) shape;
                sq.howToColor();
            } else
                System.out.println(shape.getArea());
        }
    }
}
