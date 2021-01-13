public class Cylinder extends Circle {
    private double height = 5;
    private double volume;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        super.getArea();
        this.volume = this.area * this.height;
        return this.volume;
    }

    @Override
    public String toString() {
        return "This is a cylinder with radius = " + this.radius + " and color = " + this.color + " and volume = " + this.volume;
    }
}
