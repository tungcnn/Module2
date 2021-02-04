package factory;

import entities.IShape;

public abstract class AbstractFactory {
    public abstract IShape getShape(String str);
}
