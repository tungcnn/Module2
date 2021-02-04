package factory;

import entities.shape3D.Cube;
import entities.shape3D.Cylinder;
import entities.IShape;

public class Shape3DFactory extends AbstractFactory{
    public IShape getShape(String shape) {
        return switch (shape) {
            case "entities.shape3D.Cube" -> new Cube();
            case "entities.shape3D.Cylinder" -> new Cylinder();
            default -> null;
        };
    }
}
