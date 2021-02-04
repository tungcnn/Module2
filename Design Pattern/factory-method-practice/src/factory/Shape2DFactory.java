package factory;

import entities.shape2D.Circle;
import entities.IShape;
import entities.shape2D.Rectangle;
import entities.shape2D.Square;

public class Shape2DFactory extends AbstractFactory {
    public IShape getShape(String shape) {
        return switch (shape) {
            case "entities.shape2D.Circle" -> new Circle();
            case "entities.shape2D.Square" -> new Square();
            case "entities.shape2D.Rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
