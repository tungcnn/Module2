public class ShapeFactory {
    public Shape getShape(String shape) {
        return switch (shape) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            case "Rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
