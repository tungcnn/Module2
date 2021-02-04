public class Demo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape myCircle = sf.getShape("Circle");
        Shape mySquare = sf.getShape("Square");
        Shape myRectangle = sf.getShape("Rectangle");

        myCircle.draw();
        mySquare.draw();
        myRectangle.draw();
    }
}
