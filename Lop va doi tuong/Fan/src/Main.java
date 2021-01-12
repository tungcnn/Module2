public class Main {

    public static void main(String[] args) {
	    Fan fan1 = new Fan();
	    fan1.setSpeedFast();
	    fan1.setRadius(10);
	    fan1.setColor("yellow");
	    fan1.turnOn();
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeedMedium();
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();
        System.out.println(fan2.toString());
    }
}
class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan () {}

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeedSlow() {
        this.speed = SLOW;
    }
    public void setSpeedMedium() {
        this.speed = MEDIUM;
    }
    public void setSpeedFast() {
        this.speed = FAST;
    }
    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        this.on = true;
    }
    public void turnOff() {
        this.on = false;
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
    public String toString() {
        if (this.on)
            return "fan is on\nSpeed = " + this.speed + " color = " + this.color + " radius = " + this.radius;
        else
            return "fan is off\nColor = " + this.color + " radius = " + this.radius;
    }
}