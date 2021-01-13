public class Circle {
    protected double radius = 5;
    protected String color = "blue";
    protected double area;

    public Circle() {
    }

    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        this.area = this.radius * this.radius * Math.PI;
        return this.area;
    }

    @Override
    public String toString() {
        return "This is a circle with radius = " + this.radius + " and color = " + this.color + " and area = " + this.area;
    }
}
