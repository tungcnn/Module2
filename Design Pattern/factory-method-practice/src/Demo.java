import factory.AbstractFactory;
import entities.IShape;
import factory.ShapeFactory;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeF = new ShapeFactory();

        AbstractFactory factory2D = shapeF.getFactory("2D");
        AbstractFactory factory3D = shapeF.getFactory("3D");

        IShape circle = factory2D.getShape("entities.shape2D.Circle");
        IShape cube = factory3D.getShape("entities.shape3D.Cube");

        circle.draw();
        cube.draw();
    }
}
