package factory;

import factory.AbstractFactory;
import factory.Shape2DFactory;
import factory.Shape3DFactory;

public class ShapeFactory {
    public AbstractFactory getFactory(String str) {
        switch (str) {
            case "2D":
                return new Shape2DFactory();
            case "3D":
                return new Shape3DFactory();
            default:
                return null;
        }
    }
}
